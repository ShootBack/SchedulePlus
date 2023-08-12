package com.shootback.scheduleplus.domain.day

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.subject.Subject


interface DayRepository {
    fun getDayItem(dayItemId: Int): Day
    fun getDayListOfSubjects(dayItem: Day): LiveData<List<Subject>>
}