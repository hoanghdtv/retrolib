package com.swordfish.lemuroid.app.mobile.feature.game.react.packages
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.NativeModule
import com.facebook.react.uimanager.ViewManager


class NativeNavigatorPackage : ReactPackage {
    override fun createNativeModules(rc: ReactApplicationContext):List<NativeModule>{
        return listOf(NativeNavigatorModule(rc))
    }


    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return listOf(EmulatorViewManager())
    }
}