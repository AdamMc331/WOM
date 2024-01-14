package com.adammcneilly.wom

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.adammcneilly.wom.api.WiseOldManAPI
import com.adammcneilly.wom.theme.WOMTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var api: WiseOldManAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            val player = api.getPlayer("theadammc331")
            Log.d("ADAM_LOG", player.toString())
        }

        configureEdgeToEdgeWindow()

        setContent {
            ConfigureTransparentSystemBars()

            WOMTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    /**
     * Configures our [MainActivity] window so that it reaches edge to edge of the device, meaning
     * content can be rendered underneath the status and navigation bars.
     *
     * This method works hand in hand with [ConfigureTransparentSystemBars], to make sure content
     * behind these bars is visible.
     *
     * Keep in mind that if you need to make sure your content padding doesn't clash with the status bar text/icons,
     * you can leverage modifiers like `windowInsetsPadding()` and `systemBarsPadding()`. For more information,
     * read the Compose WindowInsets docs: https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/WindowInsets
     */
    private fun configureEdgeToEdgeWindow() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    @Composable
    private fun ConfigureTransparentSystemBars() {
        val systemUiController = rememberSystemUiController()
        val useDarkIcons = !isSystemInDarkTheme()

        DisposableEffect(systemUiController, useDarkIcons) {
            systemUiController.setSystemBarsColor(
                color = Color.Transparent,
                darkIcons = useDarkIcons,
            )

            onDispose { }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
