package com.shootback.scheduleplus.data.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.DayMapper
import com.shootback.scheduleplus.domain.day.Day
import com.shootback.scheduleplus.domain.day.DayRepository
import com.shootback.scheduleplus.domain.subject.Subject
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.mappers.SubjectMapper

class DayRepositoryImpl(context: Context) : DayRepository {

    private val dayDao = AppDatabase.getInstance(context).dayDao()

    override fun getDayItem(dayItemId: Int): Day = DayMapper.toModel(dayDao.getDayById(dayItemId))

    override fun getDayListOfSubjects(dayItem: Day): LiveData<List<Subject>>
    = dayDao.getAllSubjects(dayItem.id).map { SubjectMapper.toModelList(it) }
}