package com.shootback.scheduleplus.domain.subject

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.note.Note

class GetSubjectListOfNotes(private val subjectRepository: SubjectRepository) {
    fun getSubjectListOfNotes(subjectItemId: Int) : LiveData<List<Note>> {
        return subjectRepository.getSubjectListOfNotes(subjectItemId)
    }
}