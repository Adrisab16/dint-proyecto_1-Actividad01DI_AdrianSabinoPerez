package com.example.actividad1di.buttonfooter

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
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'button_footer'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonFooter(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Image39()
    }
}

@Preview(widthDp = 360, heightDp = 202)
@Composable
private fun ButtonFooterPreview() {
    MaterialTheme {
        ButtonFooter()
    }
}

@Composable
fun Image39(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.button_footer_image_39),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(202.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
