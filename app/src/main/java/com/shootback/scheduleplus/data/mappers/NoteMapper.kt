package com.shootback.scheduleplus.data.mappers

import com.shootback.scheduleplus.data.entities.NoteEntity
import com.shootback.scheduleplus.domain.note.Note


object NoteMapper {
    fun toEntity(it: Note) = NoteEntity(
        id = it.id,
        name = it.name,
        description = it.description,
        color = it.color,
        subjectId = it.subjectId
    )

    fun toModel(it: NoteEntity) = Note(
        id = it.id,
        name = it.name,
        description = it.description,
        color = it.color,
        subjectId = it.subjectId
    )

    fun toModelList(list: List<NoteEntity>) = list.map {
        toModel(it)
    }
}