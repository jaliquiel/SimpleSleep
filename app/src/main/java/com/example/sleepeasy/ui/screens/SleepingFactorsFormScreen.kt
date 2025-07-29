package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sleepeasy.ui.components.CommonScaffold

@Composable
fun SleepingFactorsFormScreen(
    popStackCallback : () -> Unit = { /* No-op by default */ },
) {
    CommonScaffold(
        title = "Record Sleeping Factors",
        popStackCallback = popStackCallback,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
        ) {

            var sliderPosition by remember { mutableStateOf(0) }
            Column {
                Text("Cups of Caffenated Bevarage: ${sliderPosition}", modifier = Modifier.padding(bottom = 8.dp))
                Slider(
                    value = sliderPosition.toFloat(),
                    onValueChange = {
                        sliderPosition = it.toInt()
//                        onValueChange(it.toInt()) // TODO
                    },
                    valueRange = 0f..5f,
                    steps = 4,
                    modifier = Modifier.fillMaxWidth()
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun SleepingFactorsFormScreenPreview() {
    SleepingFactorsFormScreen(
        popStackCallback = { /* No-op for preview */ }
    )
}