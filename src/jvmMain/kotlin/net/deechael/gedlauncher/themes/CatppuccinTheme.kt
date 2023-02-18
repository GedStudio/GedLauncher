package net.deechael.gedlauncher.themes

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import net.deechael.gedlauncher.colors.Catppuccin

private val latteColors = lightColors(
    background = Catppuccin.Latte.Base,
    primary = Catppuccin.Latte.Lavender,
    secondary = Catppuccin.Latte.Sky,
    error = Catppuccin.Latte.Flamingo
)

private val mochaColors = darkColors(
    background = Catppuccin.Mocha.Base,
    primary = Catppuccin.Mocha.Lavender,
    secondary = Catppuccin.Mocha.Sky,
    error = Catppuccin.Mocha.Flamingo
)

@Composable
fun LatteTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = latteColors,
        content = content
    )
}

@Composable
fun MochaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = mochaColors,
        content = content
    )
}