package com.shootback.scheduleplus.domain.day

import com.shootback.scheduleplus.domain.subject.Subject


interface DayRepository {
    fun getDayItem(dayItemId: Int): Day
    fun getDayListOfSubjects(dayItem: Day): List<Subject>
}