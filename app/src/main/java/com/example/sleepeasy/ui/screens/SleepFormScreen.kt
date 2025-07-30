package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerLayoutType
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sleepeasy.ui.components.CommonScaffold
import com.example.sleepeasy.ui.viewmodel.SleepFormViewModel
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SleepFormScreen(
    sleepHubViewModel: SleepFormViewModel = hiltViewModel(),
    popStackCallback : () -> Unit = { /* No-op by default */ },
    // TODO: handle submission
) {
    val currentTime = Calendar.getInstance()
    val sleepTimePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = false,
    )
    val wakeUpTimePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = false,
    )

    CommonScaffold(
        title = "Record Sleeping Time",
        popStackCallback = popStackCallback,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
        ) {
            Text("Input Sleep time:", modifier = Modifier.padding(vertical = 8.dp))
            TimePicker(
                state = sleepTimePickerState,
                layoutType = TimePickerLayoutType.Vertical,
                modifier = Modifier.fillMaxWidth()
            )
            Text("Input Wake up time:", modifier = Modifier.padding(vertical = 8.dp))
            TimePicker(
                state = wakeUpTimePickerState,
                layoutType = TimePickerLayoutType.Vertical,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
    // TODO: do we need a way to select the date?
}

@Preview
@Composable
fun SleepFormScreenPreview() {
    SleepFormScreen()
}