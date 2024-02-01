package com.example.actividad1di.backgroundfichacampeon

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.widthIn(360.0.dp, 360.0.dp).heightIn(1984.0.dp, 1984.0.dp)
    )
}
