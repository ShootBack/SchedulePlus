package com.shootback.scheduleplus.domain.note
class EditNoteItem(private val noteRepository: NoteRepository) {
    fun editNoteItem(noteItem: Note) {
        noteRepository.editNoteItem(noteItem)
    }
}