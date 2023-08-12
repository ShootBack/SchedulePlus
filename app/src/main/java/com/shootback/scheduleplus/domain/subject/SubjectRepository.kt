package com.shootback.scheduleplus.domain.subject

import androidx.lifecycle.LiveData
import com.shootback.scheduleplus.domain.note.Note

interface SubjectRepository {
    suspend fun addSubjectItem(subjectItem: Subject)
    suspend fun deleteSubjectItem(subjectItem: Subject)
    suspend fun getSubjectItem(subjectItemId: Int): Subject
    fun getSubjectListOfNotes(subjectItemId: Int): LiveData<List<Note>>
}