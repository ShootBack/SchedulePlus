package com.shootback.scheduleplus.domain.schedule

class DeleteScheduleItem(private val scheduleRepository: ScheduleRepository) {
    fun deleteScheduleItem(scheduleItem: Schedule) {
        scheduleRepository.deleteScheduleItem(scheduleItem)
    }
}