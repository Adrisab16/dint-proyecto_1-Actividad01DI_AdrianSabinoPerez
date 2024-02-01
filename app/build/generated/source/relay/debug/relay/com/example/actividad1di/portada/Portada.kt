package com.example.actividad1di.portada

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'portada'.
 * Generated code; do not edit directly
 */
@Composable
fun Portada(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Klipartz3()
        Group3 {
            Klipartz2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Klipartz1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Klipartz4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 384, heightDp = 754)
@Composable
private fun PortadaPreview() {
    MaterialTheme {
        Portada()
    }
}

@Composable
fun Klipartz3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(174.0.dp)
    )
}

@Composable
fun Klipartz2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 192.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 403.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).alpha(alpha = 0.5f)
    )
}

@Composable
fun Klipartz1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 20.0.dp,
                end = 216.0.dp,
                bottom = 397.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).alpha(alpha = 0.5f)
    )
}

@Composable
fun Klipartz4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_4),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 184.0.dp,
                end = 24.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).alpha(alpha = 0.5f)
    )
}

@Composable
fun Group3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(384.0.dp).requiredHeight(580.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
