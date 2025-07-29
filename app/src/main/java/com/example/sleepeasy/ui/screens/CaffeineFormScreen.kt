package com.example.sleepeasy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sleepeasy.ui.components.CommonScaffold

@Composable
fun CaffeineFormScreen(
    popStackCallback : () -> Unit = { /* No-op by default */ },
) {
    CommonScaffold(
        title = "Record Caffeine Intake",
        popStackCallback = popStackCallback,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
        ) {
            Text("TODO")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CaffeineFormScreenPreview() {
    CaffeineFormScreen(
        popStackCallback = { /* No-op for preview */ }
    )
}