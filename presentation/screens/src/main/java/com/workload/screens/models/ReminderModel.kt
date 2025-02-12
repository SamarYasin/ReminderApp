package com.workload.screens.models

data class ReminderModel(
    var id: Int,
    var heading: String,
    var text: String,
    var createdDate: Long,
    var modifiedDate: Long
)
