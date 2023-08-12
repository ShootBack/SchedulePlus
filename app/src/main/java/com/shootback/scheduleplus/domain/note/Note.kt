package com.shootback.scheduleplus.domain.note
data class Note(
    val id: Int,
    val name: String,
    val description: String,
    val color: String,
    val subjectId: Int
) {
}