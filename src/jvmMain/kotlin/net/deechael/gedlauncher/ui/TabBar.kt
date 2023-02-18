package net.deechael.gedlauncher.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TabBar(
    index: Int,
    onHome: () -> Unit = {},
    onDownload: () -> Unit = {},
    onSettings: () -> Unit = {}
) {
    TabRow(
        index
    ) {
        Tab(
            selected = index == 0,
            onClick = onHome
        ) {
            Text(
                text = "主页",
                modifier = Modifier.padding(8.dp)
            )
        }
        Tab(
            selected = index == 1,
            onClick = onDownload
        ) {
            Text(
                text = "下载",
                modifier = Modifier.padding(8.dp)
            )
        }
        Tab(
            selected = index == 2,
            onClick = onSettings
        ) {
            Text(
                text = "设置",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}