package com.example.actividad1di.tituloseleccionderol

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'titulo_seleccion_de_rol'.
 * Generated code; do not edit directly
 */
@Composable
fun TituloSeleccionDeRol(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        SELECCINDEROL()
    }
}

@Preview(widthDp = 300, heightDp = 104)
@Composable
private fun TituloSeleccionDeRolPreview() {
    MaterialTheme {
        TituloSeleccionDeRol()
    }
}

@Composable
fun SELECCINDEROL(modifier: Modifier = Modifier) {
    RelayText(
        content = "SELECCIÓN DE ROL",
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
        modifier = modifier.requiredWidth(300.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
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
            red = 27,
            green = 27,
            blue = 27
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 10.0.dp,
            end = 0.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier
    )
}
