package com.example.actividad1di.infolanes

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'info_lanes'.
 * Generated code; do not edit directly
 */
@Composable
fun InfoLanes(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            Image40()
        }
        TOPLANE(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Infotxt(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 545, heightDp = 485)
@Composable
private fun InfoLanesPreview() {
    MaterialTheme {
        RelayContainer {
            InfoLanes(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Image40(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.info_lanes_image_40),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(545.0.dp).requiredHeight(445.0.dp).alpha(alpha = 0.30000001192092896f)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 20.0.dp,
            end = 0.0.dp,
            bottom = 20.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun TOPLANE(modifier: Modifier = Modifier) {
    RelayText(
        content = "TOPLANE",
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
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 130.466796875.dp,
                top = 0.0.dp,
                end = 131.13320922851562.dp,
                bottom = 431.6055030822754.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Infotxt(modifier: Modifier = Modifier) {
    RelayText(
        content = "El TOP es una posición solitaria, se juega en la línea superior del mapa y generalmente deben estar apartados del equipo. Comúnmente como Top laner solamente nos reuniremos con nuestro equipo después de que derrumbemos la torre que se encuentra delante de nosotros, con nuestro team reunido decidiremos lo que haremos a continuación para poder intentar llegar al nexo enemigo para así conseguir finalmente la victoria.\n\nAlgunos ejemplos de campeones estrella en esta linea son: Mordekaiser, Fiora, Malphite, Sett, etc.\n\nAdentrate en la toplane pulsando el siguiente botón:",
        fontSize = 13.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.41015625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 130.800048828125.dp,
                top = 82.3165283203125.dp,
                end = 130.79995727539062.dp,
                bottom = 22.2476806640625.dp
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
