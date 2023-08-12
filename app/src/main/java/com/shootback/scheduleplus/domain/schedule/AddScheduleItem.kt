package com.shootback.scheduleplus.domain.schedule

class AddScheduleItem(private val scheduleRepository: ScheduleRepository) {
    suspend fun addScheduleItem(scheduleItem: Schedule) {
        scheduleRepository.addScheduleItem(scheduleItem)
    }
}