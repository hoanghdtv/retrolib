package com.swordfish.lemuroid.app.mobile.feature.game.react.packages

import android.view.View
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import android.view.TextureView
import android.graphics.Color
import android.view.ViewGroup
import com.swordfish.lemuroid.app.mobile.feature.game.react.packages.retro.EmulatorController
import com.swordfish.lemuroid.app.shared.game.BaseGameActivity
import android.widget.FrameLayout

class EmulatorViewManager : SimpleViewManager<View>() {

    companion object {
        const val REACT_CLASS = "MyContainerView"
        private var viewInstance: FrameLayout? = null
        private var controller: EmulatorController? = null

        // Static method để access view từ native code
        fun getViewInstance(): FrameLayout? = viewInstance

        fun getEmulatorController(): EmulatorController? {
            return controller
        }
    }


    override fun getName() = "EmulatorView"

    override fun createViewInstance(reactContext: ThemedReactContext): View {
        val activity = reactContext.currentActivity
            ?: error("Activity is null")

        controller = EmulatorController(activity as BaseGameActivity)

        return controller!!.createViewInstance(reactContext)

//        val frameLayout = FrameLayout(reactContext)
//        viewInstance = frameLayout
//        return frameLayout
    }

    @ReactProp(name = "gameId")
    fun setGameId(view: View, gameId: Int) {
        controller?.setGameId(gameId)
    }

    @ReactProp(name = "gamePath")
    fun setGamePath(view: View, gamePath: String?) {
        controller?.setGamePath(gamePath)
    }

    @ReactProp(name = "system")
    fun setSystem(view: View, system: String?) {
        controller?.setSystem(system)
    }
}
