package com.workload.screens.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.workload.components.SmallFAB
import com.workload.components.TextTitleMedium
import com.workload.screens.models.ReminderModel
import timber.log.Timber

@Composable
fun RouteHomeScreen(
    modifier: Modifier,
    onFABClick: () -> Unit = {}
) {
    HomeScreen(
        modifier = modifier,
        reminderModelList = listOf(),
        onFABClick = {
            onFABClick.invoke()
        }
    )
}

@Composable
fun HomeScreen(
    modifier: Modifier,
    reminderModelList: List<ReminderModel>,
    onFABClick: () -> Unit = {}
) {

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {

        if (reminderModelList.isEmpty()) {

            TextTitleMedium(
                modifier = modifier
                    .wrapContentSize()
                    .align(Alignment.Center),
                text = "No Reminders",
                fontSize = 14.sp,
                color = Color.Black
            )

        } else {

            HomeScreenList(
                modifier = modifier,
                reminderModelList = reminderModelList,
                onItemClick = { reminderModel: ReminderModel ->
                    Timber.tag("HomeScreen").d("ReminderModel: $reminderModel")
                    //TODO: Navigate to Detail Screen
                }
            )

        }

        SmallFAB(
            onFABClick = {
                onFABClick.invoke()
            },
            modifier = modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 16.dp)
        )

    }

}

@Preview(apiLevel = 34)
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    HomeScreen(
        modifier = modifier
            .fillMaxSize(),
        reminderModelList = listOf(),
        onFABClick = {
            //TODO: Navigate to Detail Screen
        }
    )
}