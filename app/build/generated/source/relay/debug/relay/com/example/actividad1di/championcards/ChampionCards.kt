package com.example.actividad1di.championcards

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
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'champion_cards'.
 * Generated code; do not edit directly
 */
@Composable
fun ChampionCards(
    modifier: Modifier = Modifier,
    settCard: () -> Unit = {},
    garenCard: () -> Unit = {},
    malphiteCard: () -> Unit = {},
    fioraCard: () -> Unit = {},
    nasusCard: () -> Unit = {},
    sionCard: () -> Unit = {},
    trundleCard: () -> Unit = {},
    mordeCard: () -> Unit = {},
    jaxCard: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Group9 {
            SETTCARD(
                settCard = settCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            GARENCARD(
                garenCard = garenCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            MALPHITECARD(
                malphiteCard = malphiteCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            Sett(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Malphite(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Garen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            SETT(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            MALPHITE(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            GAREN(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Group10 {
            FIORACARD(
                fioraCard = fioraCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            Fiora(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle5(
                nasusCard = nasusCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            Nasus(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle7(
                sionCard = sionCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            Sion(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            FIORA(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            NASUS(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            SION(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Group11 {
            TRUNDLECARD(
                trundleCard = trundleCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            MORDEKIASERCARD(
                mordeCard = mordeCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            Mordekaiser(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Trundle(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            JAXCARD(
                jaxCard = jaxCard,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
            JAX(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Jax(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TRUNDLE(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            MORDEKAISER(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 296, heightDp = 488)
@Composable
private fun ChampionCardsPreview() {
    MaterialTheme {
        ChampionCards(
            settCard = {},
            garenCard = {},
            malphiteCard = {},
            fioraCard = {},
            nasusCard = {},
            sionCard = {},
            trundleCard = {},
            mordeCard = {},
            jaxCard = {}
        )
    }
}

@Composable
fun SETTCARD(
    settCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_sett_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = settCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun GARENCARD(
    garenCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_garen_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = garenCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MALPHITECARD(
    malphiteCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_malphite_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = malphiteCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Sett(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sett",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 244,
            green = 99,
            blue = 37
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 109.0.dp,
                top = 102.0.dp,
                end = 107.0.dp,
                bottom = 15.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Malphite(modifier: Modifier = Modifier) {
    RelayText(
        content = "Malphite",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 62,
            green = 36,
            blue = 27
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 100.0.dp,
                end = 0.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Garen(modifier: Modifier = Modifier) {
    RelayText(
        content = "Garen",
        fontSize = 11.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 248,
            green = 194,
            blue = 56
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 99.0.dp,
                end = 216.0.dp,
                bottom = 13.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SETT(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_sett),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MALPHITE(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_malphite),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun GAREN(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_garen),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun FIORACARD(
    fioraCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_fiora_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = fioraCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Fiora(modifier: Modifier = Modifier) {
    RelayText(
        content = "Fiora",
        fontSize = 11.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 221,
            green = 41,
            blue = 85
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 99.0.dp,
                end = 216.0.dp,
                bottom = 13.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle5(
    nasusCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_rectangle_5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = nasusCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Nasus(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nasus",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 149,
            green = 25,
            blue = 192
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 109.0.dp,
                top = 102.0.dp,
                end = 107.0.dp,
                bottom = 15.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Rectangle7(
    sionCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_rectangle_7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = sionCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Sion(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sion",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 166,
            green = 0,
            blue = 0
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 100.0.dp,
                end = 0.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun FIORA(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_fiora),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun NASUS(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_nasus),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SION(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_sion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TRUNDLECARD(
    trundleCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_trundle_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = trundleCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MORDEKIASERCARD(
    mordeCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_mordekiaser_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = mordeCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Mordekaiser(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mordekaiser",
        fontSize = 11.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 56,
            green = 200,
            blue = 148
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 99.0.dp,
                end = 216.0.dp,
                bottom = 13.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Trundle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Trundle",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 0,
            green = 180,
            blue = 136
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 109.0.dp,
                top = 102.0.dp,
                end = 107.0.dp,
                bottom = 15.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun JAXCARD(
    jaxCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.champion_cards_jax_card),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = jaxCard).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun JAX(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_jax),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Jax(modifier: Modifier = Modifier) {
    RelayText(
        content = "Jax",
        fontSize = 12.0.sp,
        fontFamily = arial,
        color = Color(
            alpha = 255,
            red = 59,
            green = 0,
            blue = 134
        ),
        height = 1.41015625.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 216.0.dp,
                top = 100.0.dp,
                end = 0.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TRUNDLE(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_trundle),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 108.0.dp,
                top = 0.0.dp,
                end = 108.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MORDEKAISER(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.champion_cards_mordekaiser),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 216.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 52.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
