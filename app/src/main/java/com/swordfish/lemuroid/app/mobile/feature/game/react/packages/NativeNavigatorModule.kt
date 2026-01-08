package com.swordfish.lemuroid.app.mobile.feature.game.react.packages
import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
//import com.app.modules.emulator.EmulatorActivity
import java.io.File
import android.widget.TextView
import android.graphics.Color
import android.widget.FrameLayout
import android.view.Gravity
import com.facebook.react.uimanager.UIManagerModule
import com.facebook.react.bridge.UiThreadUtil
import android.os.Handler
import android.os.Looper
import android.view.ViewGroup
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.common.UIManagerType
//        reactContext.currentActivity!!.runOnUiThread {
//            var gamePath = File(reactContext.currentActivity!!.filesDir,"10001.nes").toURI().toString()
//            var gameId = 1
//            var systemId = "nes"
//            EmulatorViewManager.getEmulatorController()?.loadGame(gameId, gamePath, systemId)
//        }
//val nativeView = TextView(reactContext).apply {
//    text = "Native View Added"
//    textSize = 24f
//}
class NativeNavigatorModule(
    private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    override fun getName() = "NativeModule"

    @ReactMethod
    fun openEmulatorActivity(reactViewTag: Int) {
//        reactContext.runOnUiQueueThread {
//            try {
//                val uiManager = UIManagerHelper.getUIManager(
//                    reactContext,
//                    UIManagerType.FABRIC
//                ) ?: UIManagerHelper.getUIManager(
//                    reactContext,
//                    UIManagerType.DEFAULT
//                )
//
//                val nativeView = TextView(reactContext).apply {
//                    text = "Native View Added"
//                }
//                (uiManager?.resolveView(reactViewTag) as ViewGroup).addView(nativeView)
//                android.util.Log.e("NativeNavigator", "Error" + uiManager?.resolveView(reactViewTag)!! )
////                uiManager.addUIBlock { nativeViewHierarchyManager ->
////                    val view = nativeViewHierarchyManager.resolveView(reactViewTag)
////                    val context = view.context
////
////                    view.addView(nativeView)
////
////                }
//
//
//
//            } catch (e: Exception) {
//                android.util.Log.e("NativeNavigator", "Error", e)
//            }
//        }
    }
}