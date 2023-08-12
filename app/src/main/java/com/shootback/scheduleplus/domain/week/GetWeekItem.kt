package com.shootback.scheduleplus.domain.week

class GetWeekItem(private val weekRepository: WeekRepository) {
    suspend fun getWeekItem(weekItemId: Int): Week {
        return weekRepository.getWeekItem(weekItemId)
    }
}