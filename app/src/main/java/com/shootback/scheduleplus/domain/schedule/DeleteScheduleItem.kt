package com.shootback.scheduleplus.domain.schedule

class DeleteScheduleItem(private val scheduleRepository: ScheduleRepository) {
    suspend fun deleteScheduleItem(scheduleItem: Schedule) {
        scheduleRepository.deleteScheduleItem(scheduleItem)
    }
}