package com.workload.screens.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.workload.screens.models.ReminderModel

@Composable
fun RouteHomeScreenList(
    modifier: Modifier,
    reminderModelList: List<ReminderModel>,
    onItemClick: (ReminderModel) -> Unit
) {
    HomeScreenList(
        modifier = modifier,
        reminderModelList = reminderModelList,
        onItemClick = onItemClick
    )
}

@Composable
fun HomeScreenList(
    modifier: Modifier,
    reminderModelList: List<ReminderModel>,
    onItemClick: (ReminderModel) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(3)
    ) {
        items(reminderModelList.size) { index ->
            RouteHomeScreenItem(
                modifier = Modifier,
                reminderModel = reminderModelList[index],
                onItemClick = onItemClick
            )
        }
    }
}

@Preview(apiLevel = 34)
@Composable
fun PreviewHomeScreenList(modifier: Modifier = Modifier) {
    HomeScreenList(modifier = modifier
        .fillMaxSize(),
        reminderModelList = listOf(),
        onItemClick = {

        }
    )
}