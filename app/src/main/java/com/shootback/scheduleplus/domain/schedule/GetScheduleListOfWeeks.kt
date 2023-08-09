package com.shootback.scheduleplus.domain.schedule

import com.shootback.scheduleplus.domain.week.Week

class GetScheduleListOfWeeks(private val scheduleRepository: ScheduleRepository) {
    fun getScheduleListOfWeeks(scheduleItemId: Int) : List<Week>{
        return scheduleRepository.getScheduleListOfWeeks(scheduleRepository.getScheduleItem(scheduleItemId))
    }
}