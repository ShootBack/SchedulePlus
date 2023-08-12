package com.shootback.scheduleplus.domain.week

class DeleteWeekItem(private val weekRepository: WeekRepository) {
    suspend fun deleteWeekItem(weekItem: Week) {
        weekRepository.deleteWeekItem(weekItem)
    }
}