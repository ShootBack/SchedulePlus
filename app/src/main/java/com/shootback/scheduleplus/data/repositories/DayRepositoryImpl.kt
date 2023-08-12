package com.shootback.scheduleplus.data.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.DayMapper
import com.shootback.scheduleplus.domain.day.Day
import com.shootback.scheduleplus.domain.day.DayRepository
import com.shootback.scheduleplus.domain.subject.Subject
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.mappers.SubjectMapper

class DayRepositoryImpl(application: Application) : DayRepository {

    private val dayDao = AppDatabase.getInstance(application).dayDao()

    override suspend fun getDayItem(dayItemId: Int): Day = DayMapper.toModel(dayDao.getDayById(dayItemId))

    override fun getDayListOfSubjects(dayItemId: Int): LiveData<List<Subject>>
    = dayDao.getAllSubjects(dayItemId).map { SubjectMapper.toModelList(it) }
}