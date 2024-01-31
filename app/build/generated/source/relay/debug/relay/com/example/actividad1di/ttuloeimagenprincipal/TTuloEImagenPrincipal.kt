package com.example.actividad1di.ttuloeimagenprincipal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 't_tulo_e_imagen_principal'.
 * Generated code; do not edit directly
 */
@Composable
fun TTuloEImagenPrincipal(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        LAPESADILLADEHIERRO(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        MORDEKAISER(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 370, heightDp = 327)
@Composable
private fun TTuloEImagenPrincipalPreview() {
    MaterialTheme {
        RelayContainer {
            TTuloEImagenPrincipal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun LAPESADILLADEHIERRO(modifier: Modifier = Modifier) {
    RelayText(
        content = "LA PESADILLA DE HIERRO",
        fontSize = 13.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.14990234375.em,
        fontWeight = FontWeight(700.0.toInt()),
        italic = true,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 300.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Image6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.t_tulo_e_imagen_principal_image_6),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.0.dp,
                top = 91.0.dp,
                end = 5.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MORDEKAISER(modifier: Modifier = Modifier) {
    RelayText(
        content = "MORDEKAISER",
        fontSize = 40.0.sp,
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
                top = 17.0.dp,
                end = 0.0.dp,
                bottom = 250.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
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
