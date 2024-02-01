package com.example.actividad1di.backgroundfichacampeon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope

/**
 * This composable was generated from the UI Package 'background_ficha_campeon'.
 * Generated code; do not edit directly
 */
@Composable
fun BackgroundFichaCampeon(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {}
}

@Preview(widthDp = 360, heightDp = 1984)
@Composable
private fun BackgroundFichaCampeonPreview() {
    MaterialTheme {
        BackgroundFichaCampeon()
    }
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.0f to Color(
                            alpha = 255,
                            red = 41,
                            green = 40,
                            blue = 40
                        ),
                        0.0f to Color(
                            alpha = 0,
                            red = 41,
                            green = 39,
                            blue = 39
                        ),
                        0.0f to Color(
                            alpha = 29,
                            red = 38,
                            green = 37,
                            blue = 37
                        ),
                        0.0f to Color(
                            alpha = 235,
                            red = 20,
                            green = 20,
                            blue = 20
                        ),
                        0.0f to Color(
                            alpha = 242,
                            red = 20,
                            green = 20,
                            blue = 20
                        ),
                        0.0f to Color(
                            alpha = 255,
                            red = 17,
                            green = 16,
                            blue = 16
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 206,
                            red = 38,
                            green = 36,
                            blue = 36
                        ),
                        start = Offset(
                            0.5f,
                            0.0f
                        ),
                        end = Offset(
                            0.5f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).widthIn(360.0.dp, 360.0.dp).heightIn(1984.0.dp, 1984.0.dp)
    )
}
