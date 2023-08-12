package com.shootback.scheduleplus.domain.week

class AddWeekItem(private val weekRepository: WeekRepository) {
    suspend fun addWeekItem(weekItem: Week) {
        weekRepository.addWeekItem(weekItem)
    }
}