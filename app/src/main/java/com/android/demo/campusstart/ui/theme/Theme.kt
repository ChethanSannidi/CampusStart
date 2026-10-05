package com.android.demo.campusstart.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = CampusBlue,
    secondary = CampusBlueDark,
    background = CampusBackground,
    surface = CampusWhite,
    onPrimary = CampusWhite,
    onBackground = CampusTextPrimary,
    onSurface = CampusTextPrimary
)

private val DarkColors = darkColorScheme(
    primary = CampusBlue,
    secondary = CampusBlueDark
)

@Composable
fun CampusStartTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = CampusStartTypography,
        content = content
    )
}