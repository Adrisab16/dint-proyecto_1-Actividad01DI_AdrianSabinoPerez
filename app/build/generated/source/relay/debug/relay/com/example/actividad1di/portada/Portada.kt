package com.example.actividad1di.portada

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'portada'.
 * Generated code; do not edit directly
 */
@Composable
fun Portada(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Klipartz2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Klipartz1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Klipartz4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BOTONTOPLANE(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CAMPEONES(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BOTONJUNGLA(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        INFOJUEGO(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BOTONTOPLANE1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        ABOUTME(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BEEMO(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Klipartz3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 1151, heightDp = 730)
@Composable
private fun PortadaPreview() {
    MaterialTheme {
        RelayContainer {
            Portada(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Klipartz2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 591.0.dp,
                top = 150.0.dp,
                end = 368.0.dp,
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
                start = 407.0.dp,
                top = 170.0.dp,
                end = 584.0.dp,
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
                start = 399.0.dp,
                top = 334.0.dp,
                end = 392.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).alpha(alpha = 0.5f)
    )
}

@Composable
fun BOTONTOPLANE(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_toplane),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 474.0.dp,
                top = 370.0.dp,
                end = 467.0.dp,
                bottom = 310.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CAMPEONES(modifier: Modifier = Modifier) {
    RelayText(
        content = "CAMPEONES",
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
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 485.0.dp,
                top = 378.0.dp,
                end = 478.0.dp,
                bottom = 318.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BOTONJUNGLA(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_jungla),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 474.0.dp,
                top = 283.0.dp,
                end = 467.0.dp,
                bottom = 397.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun INFOJUEGO(modifier: Modifier = Modifier) {
    RelayText(
        content = "INFO JUEGO",
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
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 485.0.dp,
                top = 291.0.dp,
                end = 478.0.dp,
                bottom = 405.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BOTONTOPLANE1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_toplane1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 474.0.dp,
                top = 460.0.dp,
                end = 467.0.dp,
                bottom = 220.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ABOUTME(modifier: Modifier = Modifier) {
    RelayText(
        content = "ABOUT ME",
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
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 485.0.dp,
                top = 468.0.dp,
                end = 478.0.dp,
                bottom = 228.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BEEMO(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 18.0.dp,
                end = 0.0.dp,
                bottom = 56.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Klipartz3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.portada_klipartz_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 399.0.dp,
                top = 0.0.dp,
                end = 392.0.dp,
                bottom = 556.0.dp
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
