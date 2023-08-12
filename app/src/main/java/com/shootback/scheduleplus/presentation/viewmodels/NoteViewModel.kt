package com.shootback.scheduleplus.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shootback.scheduleplus.data.repositories.NoteRepositoryImpl
import com.shootback.scheduleplus.domain.note.AddNoteItem
import com.shootback.scheduleplus.domain.note.DeleteNoteItem
import com.shootback.scheduleplus.domain.note.GetAllNotes
import com.shootback.scheduleplus.domain.note.GetNoteItem
import com.shootback.scheduleplus.domain.note.Note
import kotlinx.coroutines.launch

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = NoteRepositoryImpl(application)

    private val addNoteItem = AddNoteItem(repository)
    private val deleteNoteItem = DeleteNoteItem(repository)
    private val getNoteItem = GetNoteItem(repository)
    private val getAllNotes = GetAllNotes(repository)

    fun addNote(note: Note) {
        viewModelScope.launch { addNoteItem.addNoteItem(note) }
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch { deleteNoteItem.deleteNoteItem(note) }
    }

    fun editNote(
        note: Note,
        name: String = note.name,
        description: String = note.description,
        color: String = note.color,
    ) {
        addNote(note.copy(name = name, description = description, color = color))
    }

    fun getNote(noteId: Int): Note {
        var note: Note? = null
        viewModelScope.launch() { note = getNoteItem.getNoteItem(noteId) }
        while (true) {
            note?.let { return note as Note }
        } //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
    }

    fun getAllNotes() {
        getAllNotes.getAllNotes()
    }
}