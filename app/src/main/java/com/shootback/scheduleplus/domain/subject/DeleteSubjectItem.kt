package com.shootback.scheduleplus.domain.subject

import com.shootback.scheduleplus.domain.schedule.Schedule

class DeleteSubjectItem(private val subjectRepository: SubjectRepository) {
    fun deleteSubjectItem(subjectItem: Subject) {
        subjectRepository.deleteSubjectItem(subjectItem)
    }
}