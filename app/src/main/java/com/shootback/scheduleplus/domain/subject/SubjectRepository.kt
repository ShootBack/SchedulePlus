package com.shootback.scheduleplus.domain.subject

import com.shootback.scheduleplus.domain.note.Note

interface SubjectRepository {
    fun addSubjectItem(subjectItem: Subject)
    fun deleteSubjectItem(subjectItem: Subject)
    fun editSubjectItem(subjectItem: Subject)
    fun getSubjectItem(subjectItemId: Int): Subject
    fun getSubjectListOfNotes(subjectItem: Subject): List<Note>
}