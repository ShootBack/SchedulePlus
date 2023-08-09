package com.shootback.scheduleplus.domain.note

class DeleteNoteItem(private val noteRepository: NoteRepository) {
    fun deleteNoteItem(noteItem: Note) {
        noteRepository.deleteNoteItem(noteItem)
    }
}