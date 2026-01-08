package com.swordfish.lemuroid.app.shared.game.view

import android.app.ActivityManager
import android.content.Context
import android.opengl.GLSurfaceView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.coroutineScope
import com.swordfish.libretrodroid.GLRetroView
import com.swordfish.libretrodroid.GLRetroViewData
import com.swordfish.libretrodroid.LibretroDroid
import kotlinx.coroutines.launch
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class RetroView (context: Context, data: GLRetroViewData?) : GLRetroView(context, data) {

    private var width_ = 0
    private var height_ = 0

    override fun initialize() {
        openGLESVersion = getGLESVersion(context)
        preserveEGLContextOnPause = true
        setEGLContextClientVersion(openGLESVersion)
        setRenderer(Renderer2())
        keepScreenOn = true
    }

    fun setup(data: GLRetroViewData?){
        this.data = data
        LibretroDroid.create(
            openGLESVersion,
            data!!.coreFilePath,
            data!!.systemDirectory,
            data!!.savesDirectory,
            data!!.variables,
            buildShader(data!!.shader),
            getDefaultRefreshRate(),
            data!!.preferLowLatencyAudio,
            data!!.gameVirtualFiles.isNotEmpty(),
            data!!.enableMicrophone,
            data!!.skipDuplicateFrames,
            data!!.immersiveMode,
            getDeviceLanguage()
        )
        LibretroDroid.setRumbleEnabled(data!!.rumbleEventsEnabled)

        queueEvent {
            initializeCore()

            LibretroDroid.resume()
            isEmulationReady = true
            LibretroDroid.onSurfaceChanged(width_, height_)
        }

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    override fun onCreate(lifecycleOwner: LifecycleOwner) = catchExceptions {
        lifecycle = lifecycleOwner.lifecycle
    }

    inner class Renderer2 : GLSurfaceView.Renderer {
        override fun onDrawFrame(gl: GL10) = catchExceptions {
            if (isEmulationReady) {
                LibretroDroid.step(this@RetroView)
                lifecycle?.coroutineScope?.launch {
                    retroGLEventsSubject.emit(GLRetroEvents.FrameRendered)
                }
            }
        }

        override fun onSurfaceChanged(gl: GL10, width: Int, height: Int) = catchExceptions {
            Thread.currentThread().priority = Thread.MAX_PRIORITY
//            LibretroDroid.onSurfaceChanged(width, height)
            width_ = width
            height_ = height

        }


        override fun onSurfaceCreated(gl: GL10, config: EGLConfig) = catchExceptions {
            Thread.currentThread().priority = Thread.MAX_PRIORITY
            lifecycle?.coroutineScope?.launch {
                retroGLEventsSubject.emit(GLRetroEvents.SurfaceCreated)
            }
        }
    }

}