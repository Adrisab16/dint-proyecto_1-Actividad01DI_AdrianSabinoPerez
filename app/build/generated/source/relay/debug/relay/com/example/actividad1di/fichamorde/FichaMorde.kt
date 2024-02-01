package com.example.actividad1di.fichamorde

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.ttuloeimagenprincipal.TTuloEImagenPrincipal
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope

/**
 * This composable was generated from the UI Package 'ficha_morde'.
 * Generated code; do not edit directly
 */
@Composable
fun FichaMorde(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TTULOEIMAGENPRINCIPAL()
    }
}

@Preview(widthDp = 370, heightDp = 327)
@Composable
private fun FichaMordePreview() {
    MaterialTheme {
        FichaMorde()
    }
}

@Composable
fun TTULOEIMAGENPRINCIPAL(modifier: Modifier = Modifier) {
    TTuloEImagenPrincipal(modifier = modifier.requiredWidth(370.0.dp).requiredHeight(327.0.dp))
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
