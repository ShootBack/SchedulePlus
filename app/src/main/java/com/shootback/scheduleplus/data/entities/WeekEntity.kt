package com.shootback.scheduleplus.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weeks")
data class WeekEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val number: Int,
    val scheduleId: Int
)
