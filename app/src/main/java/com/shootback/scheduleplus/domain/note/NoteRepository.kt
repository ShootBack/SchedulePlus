package com.shootback.scheduleplus.domain.note

import androidx.lifecycle.LiveData


interface NoteRepository {
    suspend fun addNoteItem(noteItem: Note)
    suspend fun deleteNoteItem(noteItem: Note)
    suspend fun editNoteItem(noteItem: Note)
    fun getNoteItem(noteItemId: Int): Note
    fun getAllNotes() : LiveData<List<Note>>
}