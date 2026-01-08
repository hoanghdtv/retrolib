package com.swordfish.lemuroid.app.mobile.feature.game.react.packages.retro

import android.content.Context
import android.widget.FrameLayout
import com.swordfish.libretrodroid.GLRetroView
import android.view.View
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import androidx.core.view.doOnAttach

class EmulatorView(context: Context) : FrameLayout(context) {
    private var glView: GLRetroView? = null
    val mainHandler = Handler(Looper.getMainLooper())
    fun getGLView(): GLRetroView? = glView
    fun setGLView(glView: GLRetroView?) {
//        this.glView = glView
//        glView.holder.addCallback(object : SurfaceHolder.Callback {
//            override fun surfaceCreated(holder: SurfaceHolder) {
//                Log.e("GL", "surfaceCreated")
//            }
//
//            override fun surfaceChanged(holder: SurfaceHolder, f: Int, w: Int, h: Int) {
//                Log.e("GL", "surfaceChanged $w x $h")
//            }
//
//            override fun surfaceDestroyed(holder: SurfaceHolder) {
//                Log.e("GL", "surfaceDestroyed")
//            }
//        })
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        glView?.onResume()

    }

    override fun onDetachedFromWindow() {
        glView?.onPause()
        super.onDetachedFromWindow()
    }
}
