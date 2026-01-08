package com.swordfish.lemuroid.app.mobile.feature.game.react

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
//import com.facebook.react.ReactFragment
import com.swordfish.lemuroid.app.shared.game.BaseGameActivity
import com.swordfish.lemuroid.app.shared.game.BaseGameScreenViewModel
import com.swordfish.lemuroid.app.shared.main.BusyActivity
import com.swordfish.lemuroid.lib.android.RetrogradeComponentActivity
import kotlinx.coroutines.DelicateCoroutinesApi

@Composable
public fun ReactNativeHost(
    modifier: Modifier = Modifier,
    fragmentTag: String = "react_native",
    moduleName: String = "App",
) {
    val context = LocalContext.current
    val activity = context as? BaseGameActivity ?: return
    val fm: FragmentManager = activity.supportFragmentManager
    val containerId = remember { View.generateViewId() }

    AndroidView(
        factory = { ctx ->
            FragmentContainerView(ctx).apply {
                id = containerId
                layoutParams = FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                )
            }.also { container ->
                // attach fragment once when the container is created
//                if (fm.findFragmentByTag(fragmentTag) == null) {
//                    // Use ReactFragment.Builder from React Native
//                    val reactFragment = ReactFragment.Builder()
//                        .setComponentName(moduleName)
//                        .setLaunchOptions(Bundle().apply { putString("message", "my value") }) // or pass Bundle with initial props
//                        .build()
//
//                    fm.commit {
//                        replace(container.id, reactFragment, fragmentTag)
//                        setReorderingAllowed(true)
//                    }
//                }
            }
        },
        update = { /* no-op */ },
        modifier = modifier,
    )
}