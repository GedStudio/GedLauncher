package net.deechael.gedlauncher.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun Page(
    index: Int,
    content: @Composable () -> Unit
) {
    Scaffold(
        topBar = {
            TabBar(index)
        }
    ) {
        content()
    }
}
