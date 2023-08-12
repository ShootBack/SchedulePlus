package com.shootback.scheduleplus.domain.schedule

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.week.Week

class GetScheduleListOfWeeks(private val scheduleRepository: ScheduleRepository) {
    fun getScheduleListOfWeeks(scheduleItemId: Int) : LiveData<List<Week>> {
        return scheduleRepository.getScheduleListOfWeeks(scheduleItemId)
    }
}