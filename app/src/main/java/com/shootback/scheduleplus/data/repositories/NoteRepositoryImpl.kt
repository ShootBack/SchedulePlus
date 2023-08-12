package com.shootback.scheduleplus.data.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.shootback.scheduleplus.data.AppDatabase
import com.shootback.scheduleplus.data.mappers.NoteMapper
import com.shootback.scheduleplus.domain.note.Note
import com.shootback.scheduleplus.domain.note.NoteRepository

class NoteRepositoryImpl(application: Application) : NoteRepository {
    private val noteDao = AppDatabase.getInstance(application).noteDao()

    override suspend fun addNoteItem(noteItem: Note) {
        noteDao.insertNote(NoteMapper.toEntity(noteItem))
    }

    override suspend fun deleteNoteItem(noteItem: Note) {
        noteDao.deleteNoteById(noteItem.id)
    }

    override suspend fun getNoteItem(noteItemId: Int): Note = NoteMapper.toModel(noteDao.getNoteById(noteItemId))

    override fun getAllNotes(): LiveData<List<Note>> = noteDao.getAllNotes().map { NoteMapper.toModelList(it) }
}