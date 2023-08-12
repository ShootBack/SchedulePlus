package com.shootback.scheduleplus.domain.note

class GetNoteItem(private val noteRepository: NoteRepository) {
    suspend fun getNoteItem(noteItemId: Int): Note {
        return noteRepository.getNoteItem(noteItemId)
    }
}