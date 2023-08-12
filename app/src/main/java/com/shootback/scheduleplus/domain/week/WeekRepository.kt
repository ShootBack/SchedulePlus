package com.shootback.scheduleplus.domain.week

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.day.Day

interface WeekRepository {
    suspend fun addWeekItem(weekItem: Week)
    suspend fun deleteWeekItem(weekItem: Week)
    suspend fun getWeekItem(weekItemId: Int): Week
    fun getWeekListOfDays(weekItemId: Int): LiveData<List<Day>>
}