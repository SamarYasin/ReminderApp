package com.workload.screens.ui.makeReminder

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.workload.components.FullWidthButton
import com.workload.components.ItemDisplayCard
import com.workload.components.TextHeadlineMedium
import com.workload.components.TextInputField
import com.workload.components.TextTitleLarge

@Composable
fun RouteMakeReminderScreen(modifier: Modifier) {
    MakeReminderScreen(
        modifier = modifier
    )
}

@Composable
fun MakeReminderScreen(modifier: Modifier) {

    var heading by remember { mutableStateOf("") }
    var taskToPerform by remember { mutableStateOf("") }
    var time by remember { mutableStateOf("") }

    ItemDisplayCard(
        modifier = modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        ) {

            TextTitleLarge(
                modifier = Modifier
                    .padding(top = 16.dp),
                text = "Make Reminder",
                color = Color.Black,
                fontSize = 24.sp
            )

            TextHeadlineMedium(
                modifier = Modifier
                    .padding(top = 16.dp),
                text = "Add Heading",
                color = Color.Black,
                fontSize = 14.sp
            )

            TextInputField(
                modifier = Modifier,
                value = heading,
                onValueChange = {
                    heading = it
                }
            )

            TextHeadlineMedium(
                modifier = Modifier,
                text = "Add Task",
                color = Color.Black,
                fontSize = 14.sp
            )

            TextInputField(
                modifier = Modifier,
                value = taskToPerform,
                onValueChange = {
                    taskToPerform = it
                }
            )

            TextHeadlineMedium(
                modifier = Modifier,
                text = "Time",
                color = Color.Black,
                fontSize = 14.sp
            )

            TextInputField(
                modifier = Modifier,
                value = time,
                onValueChange = {
                    time = it
                }
            )

            FullWidthButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 36.dp),
                buttonText = "Make Reminder",
                onBtnClick = {

                }
            )

        }

    }

}

@Preview(apiLevel = 34)
@Composable
fun PreviewMakeReminderScreen(modifier: Modifier = Modifier) {
    MakeReminderScreen(
        modifier = modifier
            .fillMaxSize()
    )
}