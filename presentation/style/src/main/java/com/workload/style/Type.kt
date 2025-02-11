package com.workload.style

import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign

val PoppinsBlackFontFamily = FontFamily(
    Font(R.font.poppins_black)
)
val PoppinsBoldFontFamily = FontFamily(
    Font(R.font.poppins_bold)
)
val PoppinsExtraBoldFontFamily = FontFamily(
    Font(R.font.poppins_extra_bold)
)
val PoppinsExtraLightFontFamily = FontFamily(
    Font(R.font.poppins_extra_light)
)
val PoppinsLightFontFamily = FontFamily(
    Font(R.font.poppins_light)
)
val PoppinsMediumFontFamily = FontFamily(
    Font(R.font.poppins_medium)
)
val PoppinsRegularFontFamily = FontFamily(
    Font(R.font.poppins_regular)
)
val PoppinsSemiBoldFontFamily = FontFamily(
    Font(R.font.poppins_semi_bold)
)
val PoppinsThinFontFamily = FontFamily(
    Font(R.font.poppins_thin)
)

val Typography = Typography(
    // Black
    displayLarge = TextStyle(
        fontFamily = PoppinsBlackFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Bold
    displayMedium = TextStyle(
        fontFamily = PoppinsBoldFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Extra Bold
    displaySmall = TextStyle(
        fontFamily = PoppinsExtraBoldFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Extra Light
    headlineLarge = TextStyle(
        fontFamily = PoppinsExtraLightFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Light
    headlineMedium = TextStyle(
        fontFamily = PoppinsLightFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Medium
    headlineSmall = TextStyle(
        fontFamily = PoppinsMediumFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Regular
    titleLarge = TextStyle(
        fontFamily = PoppinsRegularFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Semi Bold
    titleMedium = TextStyle(
        fontFamily = PoppinsSemiBoldFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    // Thin
    titleSmall = TextStyle(
        fontFamily = PoppinsThinFontFamily,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)