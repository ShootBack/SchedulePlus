package com.shootback.scheduleplus.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class SubjectEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val location: String,
    val color: String,
    val timeStart: String,
    val timeEnd: String,
    val dayId: Int
)
