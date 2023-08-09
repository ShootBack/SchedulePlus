package com.shootback.scheduleplus.domain.note

import androidx.compose.ui.graphics.Color

data class Note(
    val id: Int,
    var name: String,
    var description: String,
    var color: Color
) {
}