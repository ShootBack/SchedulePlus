package com.shootback.scheduleplus.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "days")
data class DayEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nameResId: Int,
    val weekId: Int
)
