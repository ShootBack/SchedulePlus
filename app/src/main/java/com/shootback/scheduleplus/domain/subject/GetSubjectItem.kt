package com.shootback.scheduleplus.domain.subject

import com.shootback.scheduleplus.domain.schedule.Schedule

class GetSubjectItem(private val subjectRepository: SubjectRepository) {
    fun getSubjectItem(subjectItemId: Int): Subject {
        return subjectRepository.getSubjectItem(subjectItemId)
    }
}