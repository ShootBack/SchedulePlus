package com.shootback.scheduleplus.domain.day

class GetDayItem(private val dayRepository: DayRepository) {
    suspend fun getDayItem(dayItemId: Int): Day {
        return dayRepository.getDayItem(dayItemId)
    }
}