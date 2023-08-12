package com.shootback.scheduleplus.domain.schedule

class GetScheduleItem(private val scheduleRepository: ScheduleRepository) {
    suspend fun getScheduleItem(scheduleItemId: Int): Schedule {
        return scheduleRepository.getScheduleItem(scheduleItemId)
    }
}