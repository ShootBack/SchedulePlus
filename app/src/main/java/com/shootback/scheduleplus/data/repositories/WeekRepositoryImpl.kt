package com.shootback.scheduleplus.data.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.DayMapper
import com.shootback.scheduleplus.data.mappers.WeekMapper
import com.shootback.scheduleplus.domain.day.Day
import com.shootback.scheduleplus.domain.week.Week
import com.shootback.scheduleplus.domain.week.WeekRepository

class WeekRepositoryImpl(application: Application): WeekRepository {
    private val weekDao = AppDatabase.getInstance(application).weekDao()

    override suspend fun addWeekItem(weekItem: Week) {
        weekDao.insertWeek(WeekMapper.toEntity(weekItem))
    }

    override suspend fun deleteWeekItem(weekItem: Week) {
        weekDao.deleteWeekById(weekItem.id)
    }

    override suspend fun getWeekItem(weekItemId: Int): Week = WeekMapper.toModel(weekDao.getWeekById(weekItemId))

    override fun getWeekListOfDays(weekItemId: Int): LiveData<List<Day>>
    = weekDao.getAllDays(weekItemId).map { DayMapper.toModelList(it) }
}