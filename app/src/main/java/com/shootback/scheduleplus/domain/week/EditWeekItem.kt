package com.shootback.scheduleplus.domain.week

class EditWeekItem(private val weekRepository: WeekRepository) {
    fun editWeekItem(weekItem: Week) {
        weekRepository.editWeekItem(weekItem)
    }
}