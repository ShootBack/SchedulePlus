package com.shootback.scheduleplus.domain.day

import com.shootback.scheduleplus.domain.schedule.Schedule
import com.shootback.scheduleplus.domain.schedule.ScheduleRepository

class GetDayItem(private val dayRepository: DayRepository) {
    fun getDayItem(dayItemId: Int): Day {
        return dayRepository.getDayItem(dayItemId)
    }
}