package com.shootback.scheduleplus.domain.schedule

import com.shootback.scheduleplus.domain.week.Week

data class Schedule(
    val id: Int,
    var name: String,
    var isFavorite: Boolean,
    var listOfWeeks: List<Week> = listOf(Week(0, 1))
) {
}