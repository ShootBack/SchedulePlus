package com.shootback.scheduleplus.domain.week

import com.shootback.scheduleplus.domain.day.Day

class GetWeekListOfDays(private val weekRepository: WeekRepository) {
    fun getWeekListOfDays(weekItemId: Int) : List<Day>{
        return weekRepository.getWeekListOfDays(weekRepository.getWeekItem(weekItemId))
    }
}