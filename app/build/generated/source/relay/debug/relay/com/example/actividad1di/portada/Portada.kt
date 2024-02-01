package com.example.actividad1di.portada

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'portada'.
 * Generated code; do not edit directly
 */
@Composable
fun Portada(
    modifier: Modifier = Modifier,
    campeonesButton: () -> Unit = {},
    infoJuegoButton: () -> Unit = {},
    aboutMeButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            Klipartz3()
            Group3 {
                Klipartz2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Klipartz1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Klipartz4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Group2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 87.0.dp,
                    y = 290.0.dp
                )
            )
        ) {
            BOTONTOPLANE(
                campeonesButton = campeonesButton,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            CAMPEONES(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            BOTONJUNGLA(
                infoJuegoButton = infoJuegoButton,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            INFOJUEGO(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            BOTONTOPLANE1(
                aboutMeButton = aboutMeButton,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            ABOUTME(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 384, heightDp = 754)
@Composable
private fun PortadaPreview() {
    MaterialTheme {
        RelayContainer {
            Portada(
                campeonesButton = {},
                infoJuegoButton = {},
                aboutMeButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
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
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun BOTONTOPLANE(
    campeonesButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_toplane),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 87.0.dp,
                end = 0.0.dp,
                bottom = 90.0.dp
            )
        ).tappable(onTap = campeonesButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
                start = 11.0.dp,
                top = 95.0.dp,
                end = 11.0.dp,
                bottom = 98.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BOTONJUNGLA(
    infoJuegoButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_jungla),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 177.0.dp
            )
        ).tappable(onTap = infoJuegoButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
                start = 11.0.dp,
                top = 8.0.dp,
                end = 11.0.dp,
                bottom = 185.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BOTONTOPLANE1(
    aboutMeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.portada_boton_toplane1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 177.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = aboutMeButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
                start = 11.0.dp,
                top = 185.0.dp,
                end = 11.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Group2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(227.0.dp)
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
