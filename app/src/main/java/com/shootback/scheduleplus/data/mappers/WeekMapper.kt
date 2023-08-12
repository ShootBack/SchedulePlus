package com.shootback.scheduleplus.data.mappers

import com.shootback.scheduleplus.data.entities.WeekEntity
import com.shootback.scheduleplus.domain.week.Week

object WeekMapper {
    fun toEntity(it: Week) = WeekEntity(
        id = it.id,
        number = it.number,
        scheduleId = it.scheduleId
    )

    fun toModel(it: WeekEntity) = Week(
        id = it.id,
        number = it.number,
        scheduleId = it.scheduleId
    )

    fun toModelList(list: List<WeekEntity>) = list.map {
        toModel(it)
    }
}