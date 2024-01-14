package com.adammcneilly.wom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.adammcneilly.wom.api.WiseOldManAPI
import com.adammcneilly.wom.api.dto.WOMPlayerDTO
import com.adammcneilly.wom.theme.WOMTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var api: WiseOldManAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configureEdgeToEdgeWindow()

        setContent {
            var player by remember {
                mutableStateOf(WOMPlayerDTO())
            }

            LaunchedEffect(key1 = Unit) {
                player = api.getPlayer("theadammc331")
            }

            ConfigureTransparentSystemBars()

            WOMTheme {
                Scaffold { scaffoldPadding ->
                    Column(
                        modifier = Modifier
                            .padding(scaffoldPadding),
                    ) {
                        Card(
                            modifier = Modifier
                                .padding(16.dp),
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                            ) {
//                                SkillIconLevel(
//                                    iconRes = R.drawable.ic_attack,
//                                    level = player.latestSnapshot?.data?.skills?.attack?.level ?: 0,
//                                    skillName = "Attack",
//                                )
//
//                                SkillIconLevel(
//                                    iconRes = R.drawable.ic_hitpoints,
//                                    level = player.latestSnapshot?.data?.skills?.hitpoints?.level ?: 0,
//                                    skillName = "Hitpoints",
//                                )
//
//                                SkillIconLevel(
//                                    iconRes = R.drawable.ic_mining,
//                                    level = player.latestSnapshot?.data?.skills?.mining?.level ?: 0,
//                                    skillName = "Mining",
//                                )
                            }
                        }
                    }
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
