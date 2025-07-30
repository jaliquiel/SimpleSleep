package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sleepeasy.ui.components.CommonScaffold

@Composable
fun SleepingFactorsFormScreen(
    popStackCallback: () -> Unit = { /* No-op by default */ },
) {
    CommonScaffold(
        title = "Record Sleeping Factors",
        popStackCallback = popStackCallback,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    var cupsOfCaffeineState by remember { mutableStateOf(0) }
                    Text("Cups of Caffeinated Beverage", style = MaterialTheme.typography.titleMedium)
                    Slider(
                        value = cupsOfCaffeineState.toFloat(),
                        onValueChange = { cupsOfCaffeineState = it.toInt() },
                        valueRange = 0f..5f,
                        steps = 4,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text("Selected: $cupsOfCaffeineState", style = MaterialTheme.typography.bodySmall)
                    Divider()

                    var caffeineSizeState by remember { mutableStateOf(0) }
                    Text("Average Beverage Size", style = MaterialTheme.typography.titleMedium)
                    Slider(
                        value = caffeineSizeState.toFloat(),
                        onValueChange = { caffeineSizeState = it.toInt() },
                        valueRange = 0f..2f,
                        steps = 1,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text("Selected: $caffeineSizeState", style = MaterialTheme.typography.bodySmall)
                    Divider()

                    var stressState by remember { mutableStateOf(0) }
                    Text("Stress Level", style = MaterialTheme.typography.titleMedium)
                    Slider(
                        value = stressState.toFloat(),
                        onValueChange = { stressState = it.toInt() },
                        valueRange = 0f..5f,
                        steps = 4,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text("Selected: $stressState", style = MaterialTheme.typography.bodySmall)
                    Divider()

                    var exerciseMinutes by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = exerciseMinutes,
                        onValueChange = { exerciseMinutes = it.filter { char -> char.isDigit() } },
                        label = { Text("Minutes of Exercise") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                "Tip: Logging your daily factors helps you understand your sleep patterns better!",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

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