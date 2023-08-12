package com.shootback.scheduleplus.domain.schedule

import androidx.lifecycle.LiveData

class GetScheduleList(private val scheduleRepository: ScheduleRepository) {
    fun getScheduleList() : LiveData<List<Schedule>> {
        return scheduleRepository.getScheduleList()
    }
}