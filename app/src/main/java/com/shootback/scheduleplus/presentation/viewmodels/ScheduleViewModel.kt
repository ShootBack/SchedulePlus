package com.shootback.scheduleplus.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shootback.scheduleplus.data.repositories.ScheduleRepositoryImpl
import com.shootback.scheduleplus.domain.schedule.AddScheduleItem
import com.shootback.scheduleplus.domain.schedule.DeleteScheduleItem
import com.shootback.scheduleplus.domain.schedule.GetScheduleItem
import com.shootback.scheduleplus.domain.schedule.GetScheduleList
import com.shootback.scheduleplus.domain.schedule.GetScheduleListOfWeeks
import com.shootback.scheduleplus.domain.schedule.Schedule
import kotlinx.coroutines.launch

class ScheduleViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = ScheduleRepositoryImpl(application)

    private val addScheduleItem = AddScheduleItem(repository)
    private val deleteScheduleItem = DeleteScheduleItem(repository)
    private val getScheduleItem = GetScheduleItem(repository)
    private val getScheduleList = GetScheduleList(repository)
    private val getScheduleListOfWeeks = GetScheduleListOfWeeks(repository)

    val scheduleList = getScheduleList.getScheduleList()

    fun addSchedule(schedule: Schedule) {
        viewModelScope.launch { addScheduleItem.addScheduleItem(schedule) }
    }

    fun deleteSchedule(schedule: Schedule) {
        viewModelScope.launch { deleteScheduleItem.deleteScheduleItem(schedule) }
    }

    fun editSchedule(
        schedule: Schedule,
        name: String = schedule.name,
        isFavorite: Boolean = schedule.isFavorite
    ) {
        addSchedule(schedule.copy(name = name, isFavorite = isFavorite))
    }

    fun getSchedule(scheduleId: Int) {
        viewModelScope.launch() { getScheduleItem.getScheduleItem(scheduleId) }
    }

    fun getWeeks(scheduleId: Int) {
        getScheduleListOfWeeks.getScheduleListOfWeeks(scheduleId)
    }
}