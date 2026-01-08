package com.swordfish.lemuroid.app.mobile.feature.game.react

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.swordfish.lemuroid.app.shared.game.BaseGameScreenViewModel

@Composable
fun ReactScreen() {
    ReactNativeHost(
        modifier = Modifier.fillMaxSize(),
        fragmentTag = "game_react_native",
    )
}