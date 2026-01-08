package com.swordfish.lemuroid.app.mobile.feature.game.react.packages.retro

import android.content.Context
import androidx.lifecycle.lifecycleScope
import com.swordfish.lemuroid.app.mobile.feature.game.GameService
import com.swordfish.lemuroid.app.shared.game.BaseGameActivity
import com.swordfish.lemuroid.app.shared.game.BaseGameScreenViewModel
import com.swordfish.lemuroid.app.shared.game.viewmodel.GameViewModelRetroGameView
import com.swordfish.lemuroid.lib.library.db.entity.Game
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.lifecycle.repeatOnLifecycle
import androidx.lifecycle.Lifecycle
import java.io.File
import kotlinx.coroutines.withContext
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.FrameLayout
import com.swordfish.lemuroid.R
import kotlinx.coroutines.runBlocking
import android.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

private var serviceController: GameService.GameServiceController? = null

class EmulatorController(val activity: BaseGameActivity) {

    private lateinit var game: Game
    private var emulatorView: EmulatorView? = null
    private var layout: FrameLayout? = null
    private var viewModel : BaseGameScreenViewModel? = null
    private var gameId: Int = -1
    private var gamePath: String? = null
    private var systemId: String? = null
    val mainHandler = Handler(Looper.getMainLooper())

    fun createViewInstance(context: Context): View {
//        emulatorView = EmulatorView(context)
//        return emulatorView!!
        layout = FrameLayout(context)
        return layout!!
    }

    fun getLayout(): FrameLayout? {
        return layout
    }

    fun tryLoadGame() {
        if (gameId != -1 && gamePath != null && systemId != null) {
            loadGame(gameId, gamePath, systemId)
        }
    }

    fun loadGame(gameId: Int, gamePath: String?, systemId: String?) {
        val file = File(gamePath!!)
        game = Game(
            id = gameId,
            systemId = systemId!!,
            fileUri = gamePath,
            isFavorite = false,
            fileName = file.name,
            title = "",
            lastIndexedAt = 0,
            lastPlayedAt = 0,
            developer = "",
            coverFrontUrl = "",
        )
        viewModel = activity.createViewModel(gameId, gamePath,file.name, systemId!!)

        val glView = viewModel?.createEmptyRetroView(
            activity.applicationContext,
            activity
        )
//        (activity.findViewById(R.id.react_container) as FrameLayout).addView(glView,0)
        layout!!.addView(glView, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        ))

        // start
        activity.lifecycleScope.launch {
            viewModel!!.loadGame(
                activity.applicationContext,
                viewModel!!.game,
                viewModel!!.systemCoreConfig,
                activity.gameLoader,
                true,
            )
        }

            activity.lifecycleScope.launch {
//                activity.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel!!.getGameState().flowOn(Dispatchers.IO).collect { gameState ->
                        if (gameState is GameViewModelRetroGameView.GameState.Loaded) {
                            // Đảm bảo tạo view trên Main thread
                            withContext(Dispatchers.Main.immediate) {
                                viewModel?.setupRetroView(glView!!)

//                                layout!!.setBackgroundColor(Color.RED);
//                                layout!!.addView(glView)
//                                emulatorView!!.setGLView(null)
//
                            }
                        }
                    }
//                }
            }


//        val glView = viewModel?.createRetroView(activity.applicationContext,activity)
//        emulatorView!!.setGLView(glView!!)

        // run game service
        startGameService()
    }

    fun setGameId(gameIdStr: Int) {
        gameId = gameIdStr
        tryLoadGame()
    }
    fun setGamePath(gamePath: String?) {
        this.gamePath = File(activity.filesDir,"10001.nes").toURI().toString()
        tryLoadGame()
    }
    fun setSystem(system: String?) {
        systemId = system
        tryLoadGame()
    }

    private fun startGameService() {
        serviceController = GameService.startService(activity.applicationContext, game!!)
    }

    private fun stopGameService() {
        serviceController = GameService.stopService(activity.applicationContext, serviceController)
    }

}