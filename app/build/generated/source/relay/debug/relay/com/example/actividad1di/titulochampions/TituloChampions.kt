package com.example.actividad1di.titulochampions

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'titulo_champions'.
 * Generated code; do not edit directly
 */
@Composable
fun TituloChampions(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TOPLANERS()
    }
}

@Preview(widthDp = 243, heightDp = 102)
@Composable
private fun TituloChampionsPreview() {
    MaterialTheme {
        TituloChampions()
    }
}

@Composable
fun TOPLANERS(modifier: Modifier = Modifier) {
    RelayText(
        content = "TOPLANERS",
        fontSize = 30.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        style = TextStyle(
            shadow = Shadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                offset = Offset(
                    x = 0.0f,
                    y = 4.0f
                ),
                blurRadius = 4.0f
            )
        ),
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 30.0.dp,
            end = 20.0.dp,
            bottom = 30.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
