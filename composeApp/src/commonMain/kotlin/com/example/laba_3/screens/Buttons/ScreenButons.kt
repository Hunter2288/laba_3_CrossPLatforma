package com.example.laba_3.screens.Buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laba_3.screens.Home.Home
import com.example.laba_3.ui.theme.AppTheme
import com.example.laba_3.ui.theme.onSecondaryLight


@Composable
fun ScreenButtons(onButtonClicked: (text: String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(40.dp),
    ) {
        Button(
            onClick = { onButtonClicked("Filled")},
            modifier = Modifier.width(200.dp)
            ) {
            Text("Test 1")
        }

        FilledTonalButton(onClick = { onButtonClicked("FilledTonal") }) {
            Text("Test 2")
        }

        OutlinedButton(onClick = { onButtonClicked("Outlined") }) {
            Text("Test 3")
        }

        ElevatedButton(
            onClick = { onButtonClicked("Elevated")},
            modifier = Modifier.width(200.dp).background(color = onSecondaryLight)
            ) {
            Text("Test 4")
        }

        TextButton(onClick = { onButtonClicked("Elevated")}){
            Text("Test 5")
        }


    }
}

@Preview
@Composable
private fun PreviewScreenButtons() {
    AppTheme {
        Scaffold { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                ScreenButtons({ _ -> })
            }
        }
    }
}