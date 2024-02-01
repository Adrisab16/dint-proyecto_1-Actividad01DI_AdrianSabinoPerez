package com.example.actividad1di.footer

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
import com.example.actividad1di.button.Button
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'footer'.
 * Generated code; do not edit directly
 */
@Composable
fun Footer(
    modifier: Modifier = Modifier,
    aboutMeButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TopLevelSynth(modifier = Modifier.rowWeight(1.0f)) {
            BACKGROUNDFOOTER {
                Rectangle106(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        COMPLETEFOOTER(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            PARACONTACTARCONMIGOOSABERMSINFORMACINSOBREELCREADORDELAAPLICACINPULSEELSIGUIENTEBOTN(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            BUTTON(aboutMeButton = aboutMeButton)
        }
    }
}

@Preview(widthDp = 362, heightDp = 152)
@Composable
private fun FooterPreview() {
    MaterialTheme {
        RelayContainer {
            Footer(
                aboutMeButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle106(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_rectangle_106),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BACKGROUNDFOOTER(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(543.0.dp).requiredHeight(152.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).alpha(alpha = 100.0f)
    )
}

@Composable
fun PARACONTACTARCONMIGOOSABERMSINFORMACINSOBREELCREADORDELAAPLICACINPULSEELSIGUIENTEBOTN(modifier: Modifier = Modifier) {
    RelayText(
        content = "PARA CONTACTAR CONMIGO O SABER MÁS INFORMACIÓN SOBRE EL CREADOR DE LA APLICACIÓN, PULSE EL SIGUIENTE BOTÓN",
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
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 56.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BUTTON(
    aboutMeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 62.36222839355469.dp,
                top = 77.5.dp,
                end = 63.37101745605469.dp,
                bottom = 0.0.dp
            )
        )
    )
}

@Composable
fun COMPLETEFOOTER(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.133346557617188.dp,
                top = 8.0.dp,
                end = 24.133407592773438.dp,
                bottom = 16.0.dp
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
