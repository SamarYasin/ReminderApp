package com.workload.style

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = black,
    onPrimary = white,
    primaryContainer = primaryBase,
    onPrimaryContainer = white,

    secondary = black,
    onSecondary = white,
    secondaryContainer = secondaryBase,
    onSecondaryContainer = white,

    error = black,
    onError = white,
    errorContainer = errorBase,
    onErrorContainer = white,

    outline = lightGrey
)

private val LightColorScheme = lightColorScheme(
    primary = white,
    onPrimary = black,
    primaryContainer = primaryBase,
    onPrimaryContainer = white,

    secondary = white,
    onSecondary = black,
    secondaryContainer = secondaryBase,
    onSecondaryContainer = white,

    error = white,
    onError = black,
    errorContainer = errorBase,
    onErrorContainer = white,

    outline = lightGrey
)

@Composable
fun ReminderAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}