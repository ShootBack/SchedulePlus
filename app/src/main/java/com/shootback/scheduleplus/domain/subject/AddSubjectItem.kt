package com.shootback.scheduleplus.domain.subject

class AddSubjectItem(private val subjectRepository: SubjectRepository) {
    suspend fun addSubjectItem(subjectItem: Subject) {
        subjectRepository.addSubjectItem(subjectItem)
    }
}