package com.shootback.scheduleplus.domain.subject

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.note.Note

interface SubjectRepository {
    suspend fun addSubjectItem(subjectItem: Subject)
    suspend fun deleteSubjectItem(subjectItem: Subject)
    suspend fun editSubjectItem(subjectItem: Subject)
    fun getSubjectItem(subjectItemId: Int): Subject
    fun getSubjectListOfNotes(subjectItem: Subject): LiveData<List<Note>>
}