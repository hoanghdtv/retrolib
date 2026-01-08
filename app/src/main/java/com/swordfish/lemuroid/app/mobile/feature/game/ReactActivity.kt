package com.swordfish.lemuroid.app.mobile.feature.game

import android.os.Bundle
import androidx.activity.compose.setContent
import com.swordfish.lemuroid.app.mobile.feature.game.react.ReactScreen
import com.swordfish.lemuroid.app.mobile.shared.compose.ui.AppTheme
import com.swordfish.lemuroid.app.shared.game.BaseGameActivity
import com.swordfish.lemuroid.app.shared.game.BaseGameScreen
import com.facebook.react.ReactFragment
import com.swordfish.lemuroid.R

@OptIn(_root_ide_package_.kotlinx.coroutines.DelicateCoroutinesApi::class)
abstract class ReactActivity : BaseGameActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.retro_activity)

         val reactNativeFragment = ReactFragment.Builder()
             .setComponentName("App")
             .setLaunchOptions(Bundle().apply { putString("message", "my value") })
             .build()
         supportFragmentManager
             .beginTransaction()
             .add(R.id.react_container, reactNativeFragment)
             .commit()

//        setContent {
//            AppTheme {
//                ReactScreen()
//            }
//        }

    }

}