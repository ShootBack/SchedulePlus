package com.shootback.scheduleplus.domain.note

class AddNoteItem(private val noteRepository: NoteRepository) {
    suspend fun addNoteItem(noteItem: Note) {
        noteRepository.addNoteItem(noteItem)
    }
}