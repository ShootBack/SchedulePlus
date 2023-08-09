package com.shootback.scheduleplus.domain.subject

import com.shootback.scheduleplus.domain.note.Note

class GetSubjectListOfNotes(private val subjectRepository: SubjectRepository) {
    fun getSubjectListOfNotes(subjectItemId: Int) : List<Note>{
        return subjectRepository.getSubjectListOfNotes(subjectRepository.getSubjectItem(subjectItemId))
    }
}