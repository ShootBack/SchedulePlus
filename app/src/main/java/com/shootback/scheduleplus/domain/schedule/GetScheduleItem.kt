package com.shootback.scheduleplus.domain.schedule

class GetScheduleItem(private val scheduleRepository: ScheduleRepository) {
    fun getScheduleItem(scheduleItemId: Int): Schedule {
        return scheduleRepository.getScheduleItem(scheduleItemId)
    }
}