import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.deechael.gedlauncher.api.GedLauncher
import net.deechael.gedlauncher.api.Themes
import net.deechael.gedlauncher.themes.LatteTheme
import net.deechael.gedlauncher.themes.MochaTheme
import net.deechael.gedlauncher.ui.Home
import net.deechael.gedlauncher.ui.Page

@Composable
@Preview
fun App() {
    val api = GedLauncher.getAPI()
    val configuration = api.getConfiguration()
    if (configuration.getTheme() == Themes.MOCHA) {
        MochaTheme {
            Page(0) {
                Home()
            }
        }
    } else {
        LatteTheme {
            Page(0) {
                Home()
            }
        }
    }
}

fun main() = application {
    Window(
        title = "GedLauncher",
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
