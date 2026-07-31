package com.kuldeep.momento.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = MomentoPrimary,
    secondary = MomentoSecondary,
    tertiary = MomentoTertiary
)

private val DarkColors = darkColorScheme(
    primary = MomentoPrimary,
    secondary = MomentoSecondary,
    tertiary = MomentoTertiary
)

@Composable
fun MomentoTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = MomentoTypography,
        content = content
    )
}
