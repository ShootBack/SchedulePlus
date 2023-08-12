package com.shootback.scheduleplus.domain.subject

class GetSubjectItem(private val subjectRepository: SubjectRepository) {
    suspend fun getSubjectItem(subjectItemId: Int): Subject {
        return subjectRepository.getSubjectItem(subjectItemId)
    }
}