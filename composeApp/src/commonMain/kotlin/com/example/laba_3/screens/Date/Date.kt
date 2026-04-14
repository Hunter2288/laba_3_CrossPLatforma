package com.example.laba_3.screens.Date

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laba_3.ui.theme.AppTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateScreen() {
    var selectedDate1 by remember { mutableStateOf<Long?>(null) }
    var selectedDate2 by remember { mutableStateOf<Long?>(null) }
    var showModal1 by remember { mutableStateOf(false) }
    var showModal2 by remember { mutableStateOf(false) }

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    if (isPressed) {
        showModal1 = true
    }
    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = selectedDate1?.let { convertMillisToDate(it) } ?: "",
            onValueChange = {},
            label = { Text("Picker") },
            placeholder = { Text("MM/DD/YYYY") },
            trailingIcon = { Icon(Icons.Default.DateRange, contentDescription = null) },
            readOnly = true,
            modifier = Modifier.fillMaxWidth().clickable { showModal1 = true }
        )

        OutlinedTextField(
            value = selectedDate2?.let { convertMillisToDate(it) } ?: "",
            onValueChange = {},
            label = { Text("Input") },
            placeholder = { Text("MM/DD/YYYY") },
            trailingIcon = { Icon(Icons.Default.DateRange, contentDescription = null) },
            readOnly = true,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).clickable { showModal2 = true }
        )
    }

    if (showModal1) {
        DatePickerModal(
            onDateSelected = { selectedDate1 = it },
            onDismiss = { showModal1 = false }
        )
    }

    if (showModal2) {
        DatePickerModalInput(
            onDateSelected = { selectedDate2 = it },
            onDismiss = { showModal2 = false }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModal(
    onDateSelected: (Long?) -> Unit,
    onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState()

    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onDateSelected(datePickerState.selectedDateMillis)
                onDismiss()
            }) { Text("OK") }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Cancel") }
        }
    ) {
        DatePicker(state = datePickerState)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModalInput(
    onDateSelected: (Long?) -> Unit,
    onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState(
        initialDisplayMode = androidx.compose.material3.DisplayMode.Input
    )

    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onDateSelected(datePickerState.selectedDateMillis)
                onDismiss()
            }) { Text("OK") }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Cancel") }
        }
    ) {
        DatePicker(state = datePickerState)
    }
}

fun convertMillisToDate(millis: Long): String =
    SimpleDateFormat("MM/dd/yyyy", Locale.getDefault()).format(Date(millis))

@Preview
@Composable
private fun PreviewDateScreen() {
    AppTheme {
        Scaffold { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                DateScreen()
            }
        }
    }
}