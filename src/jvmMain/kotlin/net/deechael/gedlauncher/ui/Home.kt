package net.deechael.gedlauncher.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Preview
@Composable
fun HomePreview() {
    Home()
}

@Composable
fun Home() {
    Scaffold(
        topBar = {
            TabBar(0)
        }
    ) {

    }
}