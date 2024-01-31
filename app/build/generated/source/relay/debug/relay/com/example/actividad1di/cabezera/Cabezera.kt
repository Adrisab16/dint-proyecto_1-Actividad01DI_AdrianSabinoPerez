package com.example.actividad1di.cabezera

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'cabezera'.
 * Generated code; do not edit directly
 */
@Composable
fun Cabezera(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Rectangle2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 360, heightDp = 90)
@Composable
private fun CabezeraPreview() {
    MaterialTheme {
        RelayContainer {
            Cabezera(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabezera_rectangle_2),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_5),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 107.0.dp,
                top = 11.0.dp,
                end = 107.0.dp,
                bottom = 9.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_6),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 301.0.dp,
                top = 24.0.dp,
                end = 19.0.dp,
                bottom = 22.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_7),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 12.0.dp,
                end = 281.0.dp,
                bottom = 10.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
