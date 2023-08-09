package com.shootback.scheduleplus.domain.subject

import com.shootback.scheduleplus.domain.schedule.Schedule

class EditSubjectItem(private val subjectRepository: SubjectRepository) {
    fun editSubjectItem(subjectItem: Subject) {
        subjectRepository.editSubjectItem(subjectItem)
    }
}