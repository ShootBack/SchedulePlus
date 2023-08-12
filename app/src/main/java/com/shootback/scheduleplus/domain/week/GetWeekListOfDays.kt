package com.shootback.scheduleplus.domain.week

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.day.Day

class GetWeekListOfDays(private val weekRepository: WeekRepository) {
    fun getWeekListOfDays(weekItemId: Int) : LiveData<List<Day>> {
        return weekRepository.getWeekListOfDays(weekItemId)
    }
}