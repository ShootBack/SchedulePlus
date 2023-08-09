package com.shootback.scheduleplus.domain.subject

import androidx.compose.ui.graphics.Color
import com.shootback.scheduleplus.domain.note.Note

class Subject(
    val id: Int,
    val name: String,
    val location: String,
    var color: Color,
    val timeStart: String,
    val timeEnd: String,
    var listOfNotes: List<Note>? = null
) {
}