package com.example.actividad1di.botonbackylinkaopgg

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'boton_back_y_link_a_opgg'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonBackYLinkAOpgg(
    modifier: Modifier = Modifier,
    opggLink: () -> Unit = {},
    backButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            Rectangle5(opggLink = opggLink)
            Rectangle6(backButton = backButton)
        }
        AprendeMSSobreMordekaiser(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Volver(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 304, heightDp = 32)
@Composable
private fun BotonBackYLinkAOpggPreview() {
    MaterialTheme {
        RelayContainer {
            BotonBackYLinkAOpgg(
                opggLink = {},
                backButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle5(
    opggLink: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.boton_back_y_link_a_opgg_rectangle_5),
        modifier = modifier.tappable(onTap = opggLink).requiredWidth(209.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle6(
    backButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.boton_back_y_link_a_opgg_rectangle_6),
        modifier = modifier.tappable(onTap = backButton).requiredWidth(65.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 30.0,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun AprendeMSSobreMordekaiser(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aprende más sobre Mordekaiser",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 59,
            green = 255,
            blue = 255
        ),
        height = 1.14990234375.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 8.727294921875.dp,
                end = 104.0.dp,
                bottom = 7.7575531005859375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Volver(modifier: Modifier = Modifier) {
    RelayText(
        content = "Volver",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 59,
            green = 255,
            blue = 255
        ),
        height = 1.14990234375.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 240.0.dp,
                top = 9.69696044921875.dp,
                end = 2.0.dp,
                bottom = 6.7878875732421875.dp
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
