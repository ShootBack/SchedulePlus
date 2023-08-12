package com.shootback.scheduleplus.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shootback.scheduleplus.data.repositories.DayRepositoryImpl
import com.shootback.scheduleplus.domain.day.GetDayItem
import com.shootback.scheduleplus.domain.day.GetDayListOfSubjects
import kotlinx.coroutines.launch

class DayViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = DayRepositoryImpl(application)

    private val getDayItem = GetDayItem(repository)
    private val getDayListOfSubjects = GetDayListOfSubjects(repository)

    fun getDay(dayId: Int) {
        viewModelScope.launch() { getDayItem.getDayItem(dayId) }
    }

    fun getSubjects(dayId: Int) {
        getDayListOfSubjects.getDayListOfSubjects(dayId)
    }
}