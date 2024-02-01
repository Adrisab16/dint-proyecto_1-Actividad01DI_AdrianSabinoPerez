package com.example.actividad1di.informacindelcampeon

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
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'informaci_n_del_campeon'.
 * Generated code; do not edit directly
 */
@Composable
fun InformaciNDelCampeon(
    modifier: Modifier = Modifier,
    botonVermas: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        INFORMACINDELCAMPEON(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BIOGRAFACAMPEON(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        BOTONVERMS(
            botonVermas = botonVermas,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        VerMS(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Pngaaa1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 105.0.dp,
                    y = 78.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 407, heightDp = 358)
@Composable
private fun InformaciNDelCampeonPreview() {
    MaterialTheme {
        RelayContainer {
            InformaciNDelCampeon(
                botonVermas = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun INFORMACINDELCAMPEON(modifier: Modifier = Modifier) {
    RelayText(
        content = "INFORMACIÓN DEL CAMPEON",
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 77.0.dp,
                bottom = 308.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BIOGRAFACAMPEON(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mordekaiser es un sanguinario señor de la guerra proveniente de tiempos olvidados al que los siglos han visto nacer en tres ocasiones y morir en otras dos. Utiliza sus poderes necrománticos para atar almas perdidas a una vida eterna a su servicio. Ya no quedan muchos que recuerden sus conquistas iniciales o comprendan el alcance de su poder. Aquellos que lo hacen, no obstante, temen con angustia el día en el que regrese para alzarse sobre los vivos y los muertos.",
        fontSize = 15.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.14990234375.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 60.0.dp,
                end = 77.0.dp,
                bottom = 94.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BOTONVERMS(
    botonVermas: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.informaci_n_del_campeon_boton_ver_m_s),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 278.0.dp,
                end = 342.0.dp,
                bottom = 48.0.dp
            )
        ).tappable(onTap = botonVermas).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VerMS(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver más...",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 59,
            green = 255,
            blue = 255
        ),
        height = 1.14990234375.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.0.dp,
                top = 287.0.dp,
                end = 344.0.dp,
                bottom = 55.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Pngaaa1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.informaci_n_del_campeon_pngaaa_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(302.0.dp).requiredHeight(280.0.dp).alpha(alpha = 0.20000000298023224f)
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
