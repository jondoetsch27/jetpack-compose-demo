package com.jdd.compose.demo.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = BlackJAX,
    primaryVariant = TealJAX,
    secondary = WhiteJAX,
    background = WhiteJAX
)

private val LightColorPalette = lightColors(
    primary = WhiteJAX,
    primaryVariant = BlackJAX,
    secondary = TealJAX,
    background = WhiteJAX
)

private val AlternateColorPalette = darkColors(
    primary = TealJAX,
    primaryVariant = WhiteJAX,
    secondary = BlackJAX,
    background = GoldJAX
)

@Composable
fun JacksonvilleJaguarsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else if (false) {
        AlternateColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}