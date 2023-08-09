package com.shootback.scheduleplus.domain.week

import com.shootback.scheduleplus.domain.day.Day

interface WeekRepository {
    fun addWeekItem(weekItem: Week)
    fun deleteWeekItem(weekItem: Week)
    fun editWeekItem(weekItem: Week)
    fun getWeekItem(weekItemId: Int): Week
    fun getWeekListOfDays(weekItem: Week): List<Day>
}