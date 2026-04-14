package com.example.laba_3.screens.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.annotations.TestOnly
import java.util.Date

@Composable
fun Home(
    onButtonsClicked: () -> Unit,
    onCheckboxesClicked: () -> Unit,
    onChipsClicked: () -> Unit,
    onDateClicked: ()-> Unit,
    onDialogClicked: () -> Unit,
    onDividerClicked: () -> Unit,
    onProgressBarClicked: () -> Unit,
    switch: () -> Unit,
    dial: () -> Unit,
    radio:() -> Unit
         ) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Головна сторінка", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = onButtonsClicked) {
            Text("Buttons")
        }
        Button(onClick = onCheckboxesClicked) {
            Text("Checkboxes")
        }
        Button(onChipsClicked){
            Text("Chips")
        }
        Button(onDateClicked){
            Text("Date")
        }
        Button(onDialogClicked){
            Text("Dialog")
        }

        Button(onDividerClicked){
            Text("Divider")
        }
        Button(onProgressBarClicked){
            Text("ProgressBar")
        }
        Button(radio){
            Text("Radio")
        }
        Button(switch){
            Text("Switch")
        }
        Button(dial){
            Text("Dial")
        }
    }
}

@Preview
@Composable
private fun PreviewHome(){
    Home(
        {},
        {},
        onChipsClicked = {},
        onDateClicked = {},
        onDialogClicked = {},
        onDividerClicked = {},
        {},
        radio = {},
        switch = {},
        dial = {},
    )
}