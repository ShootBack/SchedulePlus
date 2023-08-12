package com.shootback.scheduleplus.data.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.NoteMapper
import com.shootback.scheduleplus.data.mappers.SubjectMapper
import com.shootback.scheduleplus.domain.note.Note
import com.shootback.scheduleplus.domain.subject.Subject
import com.shootback.scheduleplus.domain.subject.SubjectRepository

class SubjectRepositoryImpl(application: Application): SubjectRepository {
    private val subjectDao = AppDatabase.getInstance(application).subjectDao()

    override suspend fun addSubjectItem(subjectItem: Subject) {
        subjectDao.insertSubject(SubjectMapper.toEntity(subjectItem))
    }

    override suspend fun deleteSubjectItem(subjectItem: Subject) {
        subjectDao.deleteSubjectById(subjectItem.id)
    }

    override suspend fun getSubjectItem(subjectItemId: Int): Subject
    = SubjectMapper.toModel(subjectDao.getSubjectById(subjectItemId))

    override fun getSubjectListOfNotes(subjectItemId: Int): LiveData<List<Note>>
    = subjectDao.getAllNotes(subjectItemId).map { NoteMapper.toModelList(it) }
}