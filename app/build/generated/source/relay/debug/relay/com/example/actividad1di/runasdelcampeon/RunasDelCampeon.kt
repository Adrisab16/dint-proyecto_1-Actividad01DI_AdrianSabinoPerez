package com.example.actividad1di.runasdelcampeon

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
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
 * This composable was generated from the UI Package 'runas_del_campeon'.
 * Generated code; do not edit directly
 */
@Composable
fun RunasDelCampeon(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            RUNASMORDEKAISER()
            Image32()
        }
        Rectangle103(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Rectangle105(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Rectangle102(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Image19(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.0.dp,
                    y = -24.0.dp
                )
            )
        )
        Image20(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.0.dp,
                    y = 28.0.dp
                )
            )
        )
        Image21(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -142.0.dp,
                    y = 34.0.dp
                )
            )
        )
        Image22(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.0.dp,
                    y = 54.0.dp
                )
            )
        )
        Image23(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -90.5.dp,
                    y = 34.0.dp
                )
            )
        )
        Image24(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -24.0.dp
                )
            )
        )
        Image26(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 18.0.dp
                )
            )
        )
        Image28(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 48.0.dp
                )
            )
        )
        Rectangle100(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = 16.0.dp
                )
            )
        )
        Image31(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = 16.0.dp
                )
            )
        )
        Rectangle101(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = 40.0.dp
                )
            )
        )
        Image30(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = 40.0.dp
                )
            )
        )
        Rectangle104(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = -8.0.dp
                )
            )
        )
        Image29(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 116.0.dp,
                    y = -8.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 192)
@Composable
private fun RunasDelCampeonPreview() {
    MaterialTheme {
        RelayContainer {
            RunasDelCampeon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun RUNASMORDEKAISER(modifier: Modifier = Modifier) {
    RelayText(
        content = "RUNAS MORDEKAISER",
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
        modifier = modifier.requiredWidth(312.0.dp).requiredHeight(18.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Image32(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_32),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(152.0.dp).alpha(alpha = 0.5f)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 22.0,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun Rectangle103(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_103),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 136.0.dp,
                top = 48.0.dp,
                end = 136.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle105(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_105),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 252.0.dp,
                top = 48.0.dp,
                end = 20.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle102(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_102),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.0.dp,
                top = 48.0.dp,
                end = 252.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image19(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_19),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Image20(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_20),
        radius = 30.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Image21(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_21),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Image22(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_22),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Image23(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_23),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(19.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Image24(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_24),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Image26(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_26),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Image28(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_28),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Rectangle100(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_100),
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Image31(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_31),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Rectangle101(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_101),
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Image30(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_30),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Rectangle104(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.runas_del_campeon_rectangle_104),
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Image29(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.runas_del_campeon_image_29),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
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
