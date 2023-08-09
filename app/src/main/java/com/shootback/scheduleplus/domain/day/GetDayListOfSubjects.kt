package com.shootback.scheduleplus.domain.day

import com.shootback.scheduleplus.domain.subject.Subject

class GetDayListOfSubjects(private val dayRepository: DayRepository) {
    fun getDayListOfSubjects(dayItemId: Int) : List<Subject>{
        return dayRepository.getDayListOfSubjects(dayRepository.getDayItem(dayItemId))
    }
}