package com.shootback.scheduleplus.domain.week

import com.shootback.scheduleplus.domain.day.Day

class Week(
    val id: Int,
    val number: Int
) {
    val listOfDays: List<Day> = listOf(
    Day.Monday,
    Day.Tuesday,
    Day.Wednesday,
    Day.Thursday,
    Day.Friday,
    Day.Saturday,
    Day.Sunday
    )
}