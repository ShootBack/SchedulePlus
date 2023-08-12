package com.shootback.scheduleplus.domain.note

import androidx.lifecycle.LiveData

class GetAllNotes(private val noteRepository: NoteRepository) {
    fun getAllNotes(): LiveData<List<Note>> {
        return noteRepository.getAllNotes()
    }
}