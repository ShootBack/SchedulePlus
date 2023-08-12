package com.shootback.scheduleplus.data.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.NoteMapper
import com.shootback.scheduleplus.data.mappers.SubjectMapper
import com.shootback.scheduleplus.domain.note.Note
import com.shootback.scheduleplus.domain.subject.Subject
import com.shootback.scheduleplus.domain.subject.SubjectRepository

class SubjectRepositoryImpl(context: Context): SubjectRepository {
    private val subjectDao = AppDatabase.getInstance(context).subjectDao()

    override suspend fun addSubjectItem(subjectItem: Subject) {
        subjectDao.insertSubject(SubjectMapper.toEntity(subjectItem))
    }

    override suspend fun deleteSubjectItem(subjectItem: Subject) {
        subjectDao.deleteSubjectById(subjectItem.id)
    }

    override suspend fun editSubjectItem(subjectItem: Subject) {
        subjectDao.insertSubject(SubjectMapper.toEntity(subjectItem))
    }

    override fun getSubjectItem(subjectItemId: Int): Subject
    = SubjectMapper.toModel(subjectDao.getSubjectById(subjectItemId))

    override fun getSubjectListOfNotes(subjectItem: Subject): LiveData<List<Note>>
    = subjectDao.getAllNotes(subjectItem.id).map { NoteMapper.toModelList(it) }
}