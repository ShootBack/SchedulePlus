package com.shootback.scheduleplus.domain.week

class AddWeekItem(private val weekRepository: WeekRepository) {
    fun addWeekItem(weekItem: Week) {
        weekRepository.addWeekItem(weekItem)
    }
}