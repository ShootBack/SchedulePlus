package com.shootback.scheduleplus.domain.schedule

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.week.Week

interface ScheduleRepository {
    suspend fun addScheduleItem(scheduleItem: Schedule)
    suspend fun deleteScheduleItem(scheduleItem: Schedule)
    suspend fun getScheduleItem(scheduleItemId: Int): Schedule
    fun getScheduleList(): LiveData<List<Schedule>>
    fun getScheduleListOfWeeks(scheduleItemId: Int): LiveData<List<Week>>
}