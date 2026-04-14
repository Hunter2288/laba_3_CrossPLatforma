package com.example.laba_3.screens.dial.dial

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialExample(
    onConfirm: () -> Unit,
    onDismiss: () -> Unit,
) {
    val currentTime = Calendar.getInstance()

    val timePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = true,
    )

    var showDial by remember { mutableStateOf(true) }

    Column {
        if (showDial) {
            TimePicker(state = timePickerState)
        } else {
            TimeInput(state = timePickerState)
        }

        Button(onClick = { showDial = !showDial }) {
            Text("Switch mode")
        }

        Button(onClick = onDismiss) {
            Text("Dismiss picker")
        }

        Button(onClick = onConfirm) {
            Text("Confirm selection")
        }
    }
}