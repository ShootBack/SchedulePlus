package com.shootback.scheduleplus.domain.day

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.subject.Subject

class GetDayListOfSubjects(private val dayRepository: DayRepository) {
    fun getDayListOfSubjects(dayItemId: Int) : LiveData<List<Subject>> {
        return dayRepository.getDayListOfSubjects(dayRepository.getDayItem(dayItemId))
    }
}