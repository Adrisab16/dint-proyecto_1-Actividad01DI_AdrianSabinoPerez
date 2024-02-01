package com.example.actividad1di.infomorde

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad1di.informacindelcampeon.InformaciNDelCampeon
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope

/**
 * This composable was generated from the UI Package 'info_morde'.
 * Generated code; do not edit directly
 */
@Composable
fun InfoMorde(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        INFORMACINDELCAMPEON()
    }
}

@Preview(widthDp = 407, heightDp = 358)
@Composable
private fun InfoMordePreview() {
    MaterialTheme {
        InfoMorde()
    }
}

@Composable
fun INFORMACINDELCAMPEON(modifier: Modifier = Modifier) {
    InformaciNDelCampeon(modifier = modifier.requiredWidth(407.0.dp).requiredHeight(358.0.dp))
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
