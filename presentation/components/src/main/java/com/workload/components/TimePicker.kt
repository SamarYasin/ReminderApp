package com.workload.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerLayoutType
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTimePicker(modifier: Modifier) {
    TimePicker(
        state = rememberTimePickerState(),
        modifier = modifier,
        colors = TimePickerDefaults.colors(
            periodSelectorSelectedContainerColor = Color.White,
            periodSelectorUnselectedContainerColor = Color.White,
            periodSelectorSelectedContentColor = Color.White,
            periodSelectorUnselectedContentColor = Color.White,
            timeSelectorSelectedContainerColor = Color.White,
            timeSelectorUnselectedContainerColor = Color.White
        ),
        layoutType = TimePickerLayoutType.Horizontal
    )
}

@Preview(apiLevel = 34)
@Composable
fun PreviewCustomTimePicker(modifier: Modifier = Modifier) {
    CustomTimePicker(
        modifier = modifier
            .fillMaxSize()
    )
}