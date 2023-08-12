package com.shootback.scheduleplus.data.mappers

import com.shootback.scheduleplus.data.entities.SubjectEntity
import com.shootback.scheduleplus.domain.subject.Subject

object SubjectMapper {
    fun toEntity(it: Subject) = SubjectEntity(
        id = it.id,
        name = it.name,
        location = it.location,
        color = it.color,
        timeStart = it.timeStart,
        timeEnd = it.timeEnd,
        dayId = it.dayId
    )

    fun toModel(it: SubjectEntity) = Subject(
        id = it.id,
        name = it.name,
        location = it.location,
        color = it.color,
        timeStart = it.timeStart,
        timeEnd = it.timeEnd,
        dayId = it.dayId
    )

    fun toModelList(list: List<SubjectEntity>) = list.map {
        toModel(it)
    }
}