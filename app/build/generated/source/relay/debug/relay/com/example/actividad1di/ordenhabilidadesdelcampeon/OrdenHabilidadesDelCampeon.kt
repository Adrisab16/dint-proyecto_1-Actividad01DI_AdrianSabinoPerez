package com.example.actividad1di.ordenhabilidadesdelcampeon

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
 * This composable was generated from the UI Package 'orden_habilidades_del_campeon'.
 * Generated code; do not edit directly
 */
@Composable
fun OrdenHabilidadesDelCampeon(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ORDENDEHABILIDADES()
        Group4 {
            HABILIDADQ(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            HABILIDADW(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            HABILIDADE(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            (modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Class1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Group5 {
            Rectangle57(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Q(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle58(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle59(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle60(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Q1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle61(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Q2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle62(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            R(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle63(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Q3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle87(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle88(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle65(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Q4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle89(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle90(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle75(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            R1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle76(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            R2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle91(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle92(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle94(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle95(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle96(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            E9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle80(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle79(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle77(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle81(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle98(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            R3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle97(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            R4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle84(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle78(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle85(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle86(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            W8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 320, heightDp = 158)
@Composable
private fun OrdenHabilidadesDelCampeonPreview() {
    MaterialTheme {
        OrdenHabilidadesDelCampeon()
    }
}

@Composable
fun ORDENDEHABILIDADES(modifier: Modifier = Modifier) {
    RelayText(
        content = "ORDEN DE HABILIDADES",
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
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(18.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun HABILIDADQ(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.orden_habilidades_del_campeon_habilidad_q),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 224.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HABILIDADW(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.orden_habilidades_del_campeon_habilidad_w),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 112.0.dp,
                top = 0.0.dp,
                end = 112.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HABILIDADE(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.orden_habilidades_del_campeon_habilidad_e),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 224.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun (modifier: Modifier = Modifier) {
    RelayText(
        content = ">",
        fontSize = 15.0.sp,
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
                start = 176.0.dp,
                top = 8.0.dp,
                end = 64.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Class1(modifier: Modifier = Modifier) {
    RelayText(
        content = ">",
        fontSize = 15.0.sp,
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
                start = 64.0.dp,
                top = 8.0.dp,
                end = 176.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Group4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(280.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Rectangle57(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_57),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 290.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 11.0.sp,
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
                start = 0.0.dp,
                top = 0.0.dp,
                end = 290.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_58),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.0.dp,
                top = 0.0.dp,
                end = 273.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 17.0.dp,
                top = 0.0.dp,
                end = 273.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_59),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 34.0.dp,
                top = 0.0.dp,
                end = 256.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 34.0.dp,
                top = 0.0.dp,
                end = 256.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_60),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 51.0.dp,
                top = 0.0.dp,
                end = 239.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 11.0.sp,
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
                start = 51.0.dp,
                top = 0.0.dp,
                end = 239.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_61),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 68.0.dp,
                top = 0.0.dp,
                end = 222.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 11.0.sp,
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
                start = 68.0.dp,
                top = 0.0.dp,
                end = 222.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_62),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 85.0.dp,
                top = 0.0.dp,
                end = 205.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun R(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 11.0.sp,
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
                start = 85.0.dp,
                top = 0.0.dp,
                end = 205.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_63),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 102.0.dp,
                top = 0.0.dp,
                end = 188.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 11.0.sp,
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
                start = 102.0.dp,
                top = 0.0.dp,
                end = 188.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle87(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_87),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 119.0.dp,
                top = 0.0.dp,
                end = 171.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E1(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 119.0.dp,
                top = 0.0.dp,
                end = 171.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle88(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_88),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 119.0.dp,
                top = 0.0.dp,
                end = 171.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E2(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 119.0.dp,
                top = 0.0.dp,
                end = 171.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_65),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 137.0.dp,
                top = 0.0.dp,
                end = 153.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Q4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Q",
        fontSize = 11.0.sp,
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
                start = 137.0.dp,
                top = 0.0.dp,
                end = 153.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle89(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_89),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 154.0.dp,
                top = 0.0.dp,
                end = 136.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E3(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 154.0.dp,
                top = 0.0.dp,
                end = 136.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle90(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_90),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 154.0.dp,
                top = 0.0.dp,
                end = 136.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E4(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 154.0.dp,
                top = 0.0.dp,
                end = 136.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_75),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 171.0.dp,
                top = 0.0.dp,
                end = 119.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun R1(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 11.0.sp,
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
                start = 171.0.dp,
                top = 0.0.dp,
                end = 119.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle76(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_76),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 171.0.dp,
                top = 0.0.dp,
                end = 119.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun R2(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 11.0.sp,
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
                start = 171.0.dp,
                top = 0.0.dp,
                end = 119.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle91(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_91),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 188.0.dp,
                top = 0.0.dp,
                end = 102.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E5(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 188.0.dp,
                top = 0.0.dp,
                end = 102.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle92(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_92),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 188.0.dp,
                top = 0.0.dp,
                end = 102.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E6(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 188.0.dp,
                top = 0.0.dp,
                end = 102.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle94(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_94),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E7(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle95(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_95),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E8(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle96(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_96),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun E9(modifier: Modifier = Modifier) {
    RelayText(
        content = "E",
        fontSize = 11.0.sp,
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
                start = 205.0.dp,
                top = 0.0.dp,
                end = 85.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle80(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_80),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 222.0.dp,
                top = 0.0.dp,
                end = 68.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W1(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 222.0.dp,
                top = 0.0.dp,
                end = 68.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle79(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_79),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 222.0.dp,
                top = 0.0.dp,
                end = 68.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W2(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 222.0.dp,
                top = 0.0.dp,
                end = 68.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle77(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_77),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 239.0.dp,
                top = 0.0.dp,
                end = 51.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W3(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 239.0.dp,
                top = 0.0.dp,
                end = 51.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle81(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_81),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 239.0.dp,
                top = 0.0.dp,
                end = 51.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W4(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 239.0.dp,
                top = 0.0.dp,
                end = 51.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle98(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_98),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 256.0.dp,
                top = 0.0.dp,
                end = 34.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun R3(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 11.0.sp,
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
                start = 256.0.dp,
                top = 0.0.dp,
                end = 34.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle97(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_97),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 256.0.dp,
                top = 0.0.dp,
                end = 34.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun R4(modifier: Modifier = Modifier) {
    RelayText(
        content = "R",
        fontSize = 11.0.sp,
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
                start = 256.0.dp,
                top = 0.0.dp,
                end = 34.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle84(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_84),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 273.0.dp,
                top = 0.0.dp,
                end = 17.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W5(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 273.0.dp,
                top = 0.0.dp,
                end = 17.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle78(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_78),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 273.0.dp,
                top = 0.0.dp,
                end = 17.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W6(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 273.0.dp,
                top = 0.0.dp,
                end = 17.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle85(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_85),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 290.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W7(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 290.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle86(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.orden_habilidades_del_campeon_rectangle_86),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 290.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun W8(modifier: Modifier = Modifier) {
    RelayText(
        content = "W",
        fontSize = 11.0.sp,
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
                start = 290.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Group5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(306.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 34.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
