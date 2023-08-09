package com.shootback.scheduleplus.domain.week

class DeleteWeekItem(private val weekRepository: WeekRepository) {
    fun deleteWeekItem(weekItem: Week) {
        weekRepository.deleteWeekItem(weekItem)
    }
}