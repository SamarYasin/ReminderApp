package com.workload.screens.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.workload.components.ListItemCard
import com.workload.components.TextHeadlineSmall
import com.workload.components.TextTitleMedium
import com.workload.components.TextTitleSmall
import com.workload.screens.models.ReminderModel

@Composable
fun RouteHomeScreenItem(
    modifier: Modifier,
    reminderModel: ReminderModel,
    onItemClick: (ReminderModel) -> Unit
) {
    HomeScreenItem(
        modifier = modifier,
        reminderModel = reminderModel,
        onItemClick = onItemClick
    )
}

@Composable
fun HomeScreenItem(
    modifier: Modifier,
    reminderModel: ReminderModel,
    onItemClick: (ReminderModel) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        ListItemCard(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
                .clickable {
                    onItemClick.invoke(reminderModel)
                }
        ) {

            TextTitleMedium(
                modifier = Modifier,
                text = "Heading",
                fontSize = 16.sp,
                color = Color.Black
            )

            TextHeadlineSmall(
                modifier = Modifier,
                text = "Task That i need to do",
                fontSize = 14.sp,
                color = Color.Black
            )

            TextTitleSmall(
                modifier = Modifier,
                text = "10:00 AM",
                fontSize = 14.sp,
                color = Color.Black
            )

        }

    }

}

@Preview(apiLevel = 34)
@Composable
fun PreviewHomeScreenItem(
    modifier: Modifier = Modifier
) {
    HomeScreenItem(
        modifier = modifier
            .fillMaxSize(),
        reminderModel = ReminderModel(
            id = 1,
            heading = "Heading",
            text = "Task That i need to do",
            createdDate = 1234567890,
            modifiedDate = 1234567890
        ),
        onItemClick = {

        }
    )
}