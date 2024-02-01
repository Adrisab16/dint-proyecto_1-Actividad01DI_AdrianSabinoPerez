package com.example.actividad1di.fotoinicioportada

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'foto_inicio_portada'.
 * Generated code; do not edit directly
 */
@Composable
fun FotoInicioPortada(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Klipartz3()
    }
}

@Preview(widthDp = 360, heightDp = 174)
@Composable
private fun FotoInicioPortadaPreview() {
    MaterialTheme {
        FotoInicioPortada()
    }
}

@Composable
fun Klipartz3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.foto_inicio_portada_klipartz_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(174.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
