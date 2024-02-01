package com.example.actividad1di.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
 * This composable was generated from the UI Package 'button'.
 * Generated code; do not edit directly
 */
@Composable
fun Button(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        LOREIPSUM()
    }
}

@Preview(widthDp = 205, heightDp = 53)
@Composable
private fun ButtonPreview() {
    MaterialTheme {
        Button()
    }
}

@Composable
fun LOREIPSUM(modifier: Modifier = Modifier) {
    RelayText(
        content = "LORE IPSUM",
        fontSize = 18.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 200,
            green = 156,
            blue = 56
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    )
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 40.0.dp,
            top = 14.0.dp,
            end = 40.0.dp,
            bottom = 14.0.dp
        ),
        itemSpacing = 10.0,
        radius = 20.0,
        content = content,
        modifier = modifier
    )
}
