package com.shootback.scheduleplus.domain.day

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.subject.Subject


interface DayRepository {
    suspend fun getDayItem(dayItemId: Int): Day
    fun getDayListOfSubjects(dayItemId: Int): LiveData<List<Subject>>
}