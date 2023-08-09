package com.shootback.scheduleplus.domain.schedule

class AddScheduleItem(private val scheduleRepository: ScheduleRepository) {
    fun addScheduleItem(scheduleItem: Schedule) {
        scheduleRepository.addScheduleItem(scheduleItem)
    }
}