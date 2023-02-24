package net.deechael.gedlauncher.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deechael.gedlauncher.api.Locale

@Preview
@Composable
fun HomePreview() {
    Home()
}

@Composable
fun Home() {
    Box(
        modifier = Modifier
    ) {
        Button(
            onClick = {
                // TODO
            },
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.BottomEnd)
                .width(240.dp)
                .height(50.dp),
            shape = RoundedCornerShape(3.dp),
        ) {
            Text(
                text = Locale.lang("buttonStartGame")
            )
        }
    }
}