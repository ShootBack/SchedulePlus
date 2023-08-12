package com.shootback.scheduleplus.data.mappers

import com.shootback.scheduleplus.data.entities.ScheduleEntity
import com.shootback.scheduleplus.domain.schedule.Schedule

object ScheduleMapper {
    fun toEntity(it: Schedule) = ScheduleEntity(
        id = it.id,
        name = it.name,
        isFavorite = it.isFavorite
    )

    fun toModel(it: ScheduleEntity) = Schedule(
        id = it.id,
        name = it.name,
        isFavorite = it.isFavorite
    )

    fun toModelList(list: List<ScheduleEntity>) = list.map {
        toModel(it)
    }
}