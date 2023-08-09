package com.shootback.scheduleplus.domain.schedule

import com.shootback.scheduleplus.domain.week.Week

interface ScheduleRepository {
    fun addScheduleItem(scheduleItem: Schedule)
    fun deleteScheduleItem(scheduleItem: Schedule)
    fun editScheduleItem(scheduleItem: Schedule)
    fun getScheduleItem(scheduleItemId: Int): Schedule
    fun getScheduleListOfWeeks(scheduleItemId: Schedule): List<Week>
}