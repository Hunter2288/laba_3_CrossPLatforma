package com.example.laba_3

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laba_3.ui.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import com.example.laba_3.screens.AppNavigation

import laba_3.composeapp.generated.resources.Res
import laba_3.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    AppTheme { AppNavigation() }
}