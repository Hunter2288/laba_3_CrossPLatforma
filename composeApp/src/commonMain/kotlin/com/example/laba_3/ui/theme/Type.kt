package com.example.laba_3.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import laba_3.composeapp.generated.resources.Abel_Regular  // ← змінено
import laba_3.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun AbelFontFamily(): FontFamily = FontFamily(
    Font(Res.font.Abel_Regular, weight = FontWeight.Normal)
)

@Composable
fun AppTypography(): Typography {
    val abel = AbelFontFamily()
    val baseline = Typography()
    return Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = abel),
        displayMedium = baseline.displayMedium.copy(fontFamily = abel),
        displaySmall = baseline.displaySmall.copy(fontFamily = abel),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = abel),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = abel),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = abel),
        titleLarge = baseline.titleLarge.copy(fontFamily = abel),
        titleMedium = baseline.titleMedium.copy(fontFamily = abel),
        titleSmall = baseline.titleSmall.copy(fontFamily = abel),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = abel),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = abel),
        bodySmall = baseline.bodySmall.copy(fontFamily = abel),
        labelLarge = baseline.labelLarge.copy(fontFamily = abel),
        labelMedium = baseline.labelMedium.copy(fontFamily = abel),
        labelSmall = baseline.labelSmall.copy(fontFamily = abel),
    )
}