package com.shootback.scheduleplus.domain.note


interface NoteRepository {
    fun addNoteItem(noteItem: Note)
    fun deleteNoteItem(noteItem: Note)
    fun editNoteItem(noteItem: Note)
    fun getNoteItem(noteItemId: Int): Note
}