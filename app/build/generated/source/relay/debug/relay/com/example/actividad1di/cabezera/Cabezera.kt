package com.example.actividad1di.cabezera

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'cabezera'.
 * Generated code; do not edit directly
 */
@Composable
fun Cabezera(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Image7()
        Image5()
        Image6()
    }
}

@Preview(widthDp = 359, heightDp = 88)
@Composable
private fun CabezeraPreview() {
    MaterialTheme {
        Cabezera()
    }
}

@Composable
fun Image7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_7),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(79.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun Image5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_5),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(146.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Image6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabezera_image_6),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(44.0.dp)
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
            red = 51,
            green = 51,
            blue = 51
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 9.0.dp,
            end = 20.0.dp,
            bottom = 9.0.dp
        ),
        itemSpacing = 27.0,
        content = content,
        modifier = modifier
    )
}
