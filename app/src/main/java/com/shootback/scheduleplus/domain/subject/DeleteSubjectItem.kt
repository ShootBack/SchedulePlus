package com.shootback.scheduleplus.domain.subject

class DeleteSubjectItem(private val subjectRepository: SubjectRepository) {
    suspend fun deleteSubjectItem(subjectItem: Subject) {
        subjectRepository.deleteSubjectItem(subjectItem)
    }
}