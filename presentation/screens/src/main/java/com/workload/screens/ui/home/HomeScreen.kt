package com.workload.screens.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.workload.screens.models.ReminderModel
import timber.log.Timber

@Composable
fun RouteHomeScreen(modifier: Modifier) {
    HomeScreen(
        modifier = modifier,
        reminderModelList = listOf()
    )
}

@Composable
fun HomeScreen(
    modifier: Modifier,
    reminderModelList: List<ReminderModel>
) {

    HomeScreenList(
        modifier = modifier,
        reminderModelList = reminderModelList,
        onItemClick = { reminderModel: ReminderModel ->
            Timber.tag("HomeScreen").d("ReminderModel: $reminderModel")
            //TODO: Navigate to Detail Screen
        }
    )

}

@Preview(apiLevel = 34)
@Composable
fun PreviewHomeScreen(modifier: Modifier = Modifier) {
    HomeScreen(
        modifier = modifier
            .fillMaxSize(),
        reminderModelList = listOf()
    )
}