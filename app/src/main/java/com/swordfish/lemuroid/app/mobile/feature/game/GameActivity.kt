package com.swordfish.lemuroid.app.mobile.feature.game

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.compose.runtime.Composable
import com.swordfish.lemuroid.app.mobile.feature.gamemenu.GameMenuActivity
import com.swordfish.lemuroid.app.mobile.feature.shortcuts.ShortcutsGenerator
import com.swordfish.lemuroid.app.shared.GameInteractor
import com.swordfish.lemuroid.app.shared.game.BaseGameActivity
import com.swordfish.lemuroid.app.shared.game.BaseGameScreenViewModel
import com.swordfish.lemuroid.app.shared.game.GameLauncher
import com.swordfish.lemuroid.app.shared.settings.SettingsInteractor
import com.swordfish.lemuroid.common.coroutines.safeLaunch
import com.swordfish.lemuroid.lib.injection.PerActivity
import com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase
import com.swordfish.lemuroid.lib.storage.DirectoriesManager
import dagger.Provides
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import javax.inject.Inject
import com.swordfish.lemuroid.app.mobile.feature.game.ReactActivity
import kotlinx.coroutines.runBlocking
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler

@OptIn(DelicateCoroutinesApi::class)
class GameActivity : ReactActivity(), DefaultHardwareBackBtnHandler {

    private var serviceController: GameService.GameServiceController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        runBlocking {
            copyAssetFileToFilesDir(this@GameActivity);
        }
        super.onCreate(savedInstanceState)

//        startGameService()
    }

    override
    fun invokeDefaultOnBackPressed(){
            super.onBackPressed()
    }

    suspend fun copyAssetFileToFilesDir(
        context: Context,
        assetName: String = "10001.nes",
        outFileName: String = assetName
    ): File? = withContext(Dispatchers.IO) {
        val outFile = File(context.filesDir, outFileName)
        try {
            if (outFile.exists()) {
                return@withContext outFile
            }
            context.assets.open(assetName).use { input ->
                outFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            outFile
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    @Composable
    override fun GameScreen(viewModel: BaseGameScreenViewModel) {
        MobileGameScreen(viewModel)
    }

    override fun getDialogClass() = GameMenuActivity::class.java

    override fun onDestroy() {
        stopGameService()
        super.onDestroy()
    }

    private fun startGameService() {
        serviceController = GameService.startService(applicationContext, game!!)
    }

    private fun stopGameService() {
        serviceController = GameService.stopService(applicationContext, serviceController)
    }

    override fun onFinishTriggered() {
        super.onFinishTriggered()
//        stopGameService()
    }

    override fun activity(): Activity = this

    override fun isBusy(): Boolean = false

    @dagger.Module
    abstract class Module {
        @dagger.Module
        companion object {
            @Provides
            @PerActivity
            @JvmStatic
            fun settingsInteractor(
                activity: GameActivity,
                directoriesManager: DirectoriesManager,
            ) = SettingsInteractor(activity, directoriesManager)

            @Provides
            @PerActivity
            @JvmStatic
            fun gameInteractor(
                activity: GameActivity,
                retrogradeDb: RetrogradeDatabase,
                shortcutsGenerator: ShortcutsGenerator,
                gameLauncher: GameLauncher,
            ) = GameInteractor(activity, retrogradeDb, false, shortcutsGenerator, gameLauncher)
        }
    }

}
