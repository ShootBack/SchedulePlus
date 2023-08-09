package com.shootback.scheduleplus.domain.note

import com.shootback.scheduleplus.domain.schedule.Schedule

class AddNoteItem(private val noteRepository: NoteRepository) {
    fun addNoteItem(noteItem: Note) {
        noteRepository.addNoteItem(noteItem)
    }
}