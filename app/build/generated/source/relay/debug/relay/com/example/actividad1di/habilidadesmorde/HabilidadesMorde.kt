package com.example.actividad1di.habilidadesmorde

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
 * This composable was generated from the UI Package 'habilidades_morde'.
 * Generated code; do not edit directly
 */
@Composable
fun HabilidadesMorde(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        HABILIDADES(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Q(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        W(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        E(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        R(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image33(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        P(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 328, heightDp = 134)
@Composable
private fun HabilidadesMordePreview() {
    MaterialTheme {
        RelayContainer {
            HabilidadesMorde(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun HABILIDADES(modifier: Modifier = Modifier) {
    RelayText(
        content = "HABILIDADES",
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
                start = 83.0.dp,
                top = 0.0.dp,
                end = 84.69137573242188.dp,
                bottom = 104.30299949645996.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Image7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.habilidades_morde_image_7),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 74.881103515625.dp,
                top = 66.1212158203125.dp,
                end = 210.93246459960938.dp,
                bottom = 25.454509735107422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.habilidades_morde_image_8),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 208.8232421875.dp,
                top = 66.1212158203125.dp,
                end = 76.99032592773438.dp,
                bottom = 25.454509735107422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image10(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.habilidades_morde_image_10),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 277.3759765625.dp,
                top = 66.1212158203125.dp,
                end = 8.437591552734375.dp,
                bottom = 25.454509735107422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 0,
            green = 71,
            blue = 255
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 66.44384765625.dp,
                top = 117.0302734375.dp,
                end = 202.49512100219727.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun W(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 36,
            green = 232,
            blue = 161
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 133.942138671875.dp,
                top = 117.0302734375.dp,
                end = 134.99682998657227.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun E(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 255,
            green = 93,
            blue = 2
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 201.4404296875.dp,
                top = 117.0302734375.dp,
                end = 67.49853897094727.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun R(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 12.0.sp,
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
                start = 268.93896484375.dp,
                top = 117.0302734375.dp,
                end = 0.000003814697265625.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Image9(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.habilidades_morde_image_9),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 142.37939453125.dp,
                top = 66.1212158203125.dp,
                end = 143.43417358398438.dp,
                bottom = 25.454509735107422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image33(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.habilidades_morde_image_33),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.3828125.dp,
                top = 66.1212158203125.dp,
                end = 278.4307556152344.dp,
                bottom = 25.454509735107422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun P(modifier: Modifier = Modifier) {
    RelayText(
        content = "P",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 68,
            green = 0,
            blue = 136
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 117.0302734375.dp,
                end = 269.9936294555664.dp,
                bottom = 0.0.dp
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
