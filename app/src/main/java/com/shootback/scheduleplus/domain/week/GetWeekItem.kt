package com.shootback.scheduleplus.domain.week

class GetWeekItem(private val weekRepository: WeekRepository) {
    fun getWeekItem(weekItemId: Int): Week {
        return weekRepository.getWeekItem(weekItemId)
    }
}