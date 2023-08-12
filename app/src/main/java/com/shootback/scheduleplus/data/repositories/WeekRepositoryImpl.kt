package com.shootback.scheduleplus.data.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.DayMapper
import com.shootback.scheduleplus.data.mappers.WeekMapper
import com.shootback.scheduleplus.domain.day.Day
import com.shootback.scheduleplus.domain.week.Week
import com.shootback.scheduleplus.domain.week.WeekRepository

class WeekRepositoryImpl(context: Context): WeekRepository {
    private val weekDao = AppDatabase.getInstance(context).weekDao()

    override suspend fun addWeekItem(weekItem: Week) {
        weekDao.insertWeek(WeekMapper.toEntity(weekItem))
    }

    override suspend fun deleteWeekItem(weekItem: Week) {
        weekDao.deleteWeekById(weekItem.id)
    }

    override suspend fun editWeekItem(weekItem: Week) {
        weekDao.insertWeek(WeekMapper.toEntity(weekItem))
    }

    override fun getWeekItem(weekItemId: Int): Week = WeekMapper.toModel(weekDao.getWeekById(weekItemId))

    override fun getWeekListOfDays(weekItem: Week): LiveData<List<Day>>
    = weekDao.getAllDays(weekItem.id).map { DayMapper.toModelList(it) }
}