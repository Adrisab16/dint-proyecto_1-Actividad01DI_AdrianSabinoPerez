package com.example.actividad1di.countersdelcampeon

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'counters_del_campeon'.
 * Generated code; do not edit directly
 */
@Composable
fun CountersDelCampeon(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        COUNTERS()
        Group8 {
            FIORA()
            GANGPLANCK(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 56.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TRYNDAMERE(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 112.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            QUINN(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 168.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            JAX(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 224.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            OLAF(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 280.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 320, heightDp = 126)
@Composable
private fun CountersDelCampeonPreview() {
    MaterialTheme {
        RelayContainer {
            CountersDelCampeon(modifier = Modifier.rowWeight(1.0f))
        }
    }
}

@Composable
fun COUNTERS(modifier: Modifier = Modifier) {
    RelayText(
        content = "COUNTERS",
        fontSize = 20.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun FIORA(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_fiora),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun GANGPLANCK(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_gangplanck),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun TRYNDAMERE(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_tryndamere),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun QUINN(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_quinn),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun JAX(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_jax),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun OLAF(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.counters_del_campeon_olaf),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Group8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 20.0.dp,
            end = 0.0.dp,
            bottom = 20.0.dp
        ),
        itemSpacing = 30.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}
