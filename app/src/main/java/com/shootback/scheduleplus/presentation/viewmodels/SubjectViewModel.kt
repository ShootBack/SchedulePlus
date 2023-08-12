package com.shootback.scheduleplus.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shootback.scheduleplus.data.repositories.SubjectRepositoryImpl
import com.shootback.scheduleplus.domain.subject.AddSubjectItem
import com.shootback.scheduleplus.domain.subject.DeleteSubjectItem
import com.shootback.scheduleplus.domain.subject.GetSubjectItem
import com.shootback.scheduleplus.domain.subject.GetSubjectListOfNotes
import com.shootback.scheduleplus.domain.subject.Subject
import kotlinx.coroutines.launch

class SubjectViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = SubjectRepositoryImpl(application)

    private val addSubjectItem = AddSubjectItem(repository)
    private val deleteSubjectItem = DeleteSubjectItem(repository)
    private val getSubjectItem = GetSubjectItem(repository)
    private val getSubjectListOfNotes = GetSubjectListOfNotes(repository)

    fun addSubject(subject: Subject) {
        viewModelScope.launch { addSubjectItem.addSubjectItem(subject) }
    }

    fun deleteSchedule(subject: Subject) {
        viewModelScope.launch { deleteSubjectItem.deleteSubjectItem(subject) }
    }

    fun editSubject(
        subject: Subject,
        name: String = subject.name,
        location: String = subject.location,
        color: String = subject.color,
        timeStart: String = subject.timeStart,
        timeEnd: String = subject.timeEnd
    ) {
        addSubject(
            subject.copy(
                name = name,
                location = location,
                color = color,
                timeStart = timeStart,
                timeEnd = timeEnd
            )
        )
    }

    fun getSubject(subjectId: Int) {
        viewModelScope.launch() { getSubjectItem.getSubjectItem(subjectId) }
    }

    fun getNotes(subjectId: Int) {
        getSubjectListOfNotes.getSubjectListOfNotes(subjectId)
    }
}