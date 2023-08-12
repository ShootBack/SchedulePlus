package com.shootback.scheduleplus.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schedules")
data class ScheduleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val isFavorite: Boolean
)
