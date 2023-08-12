package com.shootback.scheduleplus.data.mappers

import com.shootback.scheduleplus.data.entities.DayEntity
import com.shootback.scheduleplus.domain.day.Day

object DayMapper {
    fun toEntity(it: Day) = DayEntity(
        id = it.id,
        nameResId = it.nameResId,
        weekId = it.weekId
    )

    fun toModel(it: DayEntity) = Day(
        id = it.id,
        nameResId = it.nameResId,
        weekId = it.weekId
    )

    fun toModelList(list: List<DayEntity>) = list.map {
        toModel(it)
    }
}