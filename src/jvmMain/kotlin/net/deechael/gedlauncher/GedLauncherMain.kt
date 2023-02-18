import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.deechael.gedlauncher.api.GedLauncher
import net.deechael.gedlauncher.api.Themes
import net.deechael.gedlauncher.themes.LatteTheme
import net.deechael.gedlauncher.themes.MochaTheme
import net.deechael.gedlauncher.ui.Home

@Composable
@Preview
fun App() {
    val api = GedLauncher.getAPI()
    val configuration = api.getConfiguration()
    if (configuration.getTheme() == Themes.MOCHA) {
        MochaTheme {
            Home()
        }
    } else {
        LatteTheme {
            Home()
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
