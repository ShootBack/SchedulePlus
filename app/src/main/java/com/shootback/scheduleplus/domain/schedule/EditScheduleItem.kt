package com.shootback.scheduleplus.domain.schedule

class EditScheduleItem(private val scheduleRepository: ScheduleRepository) {
    fun editScheduleItem(scheduleItem: Schedule) {
        scheduleRepository.editScheduleItem(scheduleItem)
    }
}