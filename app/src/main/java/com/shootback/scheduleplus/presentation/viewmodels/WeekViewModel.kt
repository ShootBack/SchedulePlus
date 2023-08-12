package com.shootback.scheduleplus.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shootback.scheduleplus.data.repositories.WeekRepositoryImpl
import com.shootback.scheduleplus.domain.week.AddWeekItem
import com.shootback.scheduleplus.domain.week.DeleteWeekItem
import com.shootback.scheduleplus.domain.week.GetWeekItem
import com.shootback.scheduleplus.domain.week.GetWeekListOfDays
import com.shootback.scheduleplus.domain.week.Week
import kotlinx.coroutines.launch

class WeekViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = WeekRepositoryImpl(application)

    private val addWeekItem = AddWeekItem(repository)
    private val deleteWeekItem = DeleteWeekItem(repository)
    private val getWeekItem = GetWeekItem(repository)
    private val getWeekListOfDays = GetWeekListOfDays(repository)

    fun addWeek(week: Week) {
        viewModelScope.launch { addWeekItem.addWeekItem(week) }
    }

    fun deleteWeek(week: Week) {
        viewModelScope.launch { deleteWeekItem.deleteWeekItem(week) }
    }

    fun editWeek(week: Week, number: Int = week.number) {
        addWeek(week.copy(number = number))
    }

    fun getWeek(weekId: Int) {
        viewModelScope.launch() { getWeekItem.getWeekItem(weekId) }
    }

    fun getDays(weekId: Int) {
        getWeekListOfDays.getWeekListOfDays(weekId)
    }
}