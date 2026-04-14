package com.example.laba_3.screens.Checkboxes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Checkboxes(){
    var checked by remember { mutableStateOf(true) }
    Row(modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.Center
        ) {

        Text("Тестовий чек бокс")
        Checkbox(
            checked = checked,
            onCheckedChange = {checked = it}
        )
    }
    Text(
        if (checked) "Checkbox is checked" else "Checkbox is unchecked"
    )
}