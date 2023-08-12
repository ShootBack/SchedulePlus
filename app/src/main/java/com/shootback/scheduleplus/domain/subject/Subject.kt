package com.shootback.scheduleplus.domain.subject

data class Subject(
    val id: Int,
    val name: String,
    val location: String,
    val color: String,
    val timeStart: String,
    val timeEnd: String,
    val dayId: Int
) {
}