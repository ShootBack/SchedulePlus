package com.shootback.scheduleplus.data.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.ScheduleMapper
import com.shootback.scheduleplus.data.mappers.WeekMapper
import com.shootback.scheduleplus.domain.schedule.Schedule
import com.shootback.scheduleplus.domain.schedule.ScheduleRepository
import com.shootback.scheduleplus.domain.week.Week

class ScheduleRepositoryImpl(context: Context): ScheduleRepository {
    private val scheduleDao = AppDatabase.getInstance(context).scheduleDao()

    override suspend fun addScheduleItem(scheduleItem: Schedule) {
        scheduleDao.insertSchedule(ScheduleMapper.toEntity(scheduleItem))
    }

    override suspend fun deleteScheduleItem(scheduleItem: Schedule) {
        scheduleDao.deleteScheduleById(scheduleItem.id)
    }

    override suspend fun editScheduleItem(scheduleItem: Schedule) {
        scheduleDao.insertSchedule(ScheduleMapper.toEntity(scheduleItem))
    }

    override fun getScheduleItem(scheduleItemId: Int): Schedule
    = ScheduleMapper.toModel(scheduleDao.getScheduleById(scheduleItemId))

    override fun getScheduleList(): LiveData<List<Schedule>>
    = scheduleDao.getAllSchedules().map { ScheduleMapper.toModelList(it) }

    override fun getScheduleListOfWeeks(scheduleItemId: Schedule): LiveData<List<Week>>
    = scheduleDao.getAllWeeks(scheduleItemId.id).map { WeekMapper.toModelList(it) }
}