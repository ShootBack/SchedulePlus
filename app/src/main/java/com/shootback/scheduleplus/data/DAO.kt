package com.shootback.scheduleplus.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.shootback.scheduleplus.data.entities.DayEntity
import com.shootback.scheduleplus.data.entities.NoteEntity
import com.shootback.scheduleplus.data.entities.ScheduleEntity
import com.shootback.scheduleplus.data.entities.SubjectEntity
import com.shootback.scheduleplus.data.entities.WeekEntity

@Dao
interface SubjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: SubjectEntity)

    @Query("SELECT * FROM subjects WHERE id = :subjectId LIMIT 1")
    suspend fun getSubjectById(subjectId: Int): SubjectEntity

    @Query("DELETE FROM subjects WHERE id = :subjectId")
    suspend fun deleteSubjectById(subjectId: Int)

    @Query("SELECT * FROM notes WHERE subjectId = :subjectId")
    fun getAllNotes(subjectId: Int): LiveData<List<NoteEntity>>
}

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes")
    fun getAllNotes(): LiveData<List<NoteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity)

    @Query("SELECT * FROM notes WHERE id = :noteId LIMIT 1")
    suspend fun getNoteById(noteId: Int): NoteEntity

    @Query("DELETE FROM notes WHERE id = :noteId")
    suspend fun deleteNoteById(noteId: Int)
}

@Dao
interface WeekDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeek(week: WeekEntity)

    @Query("SELECT * FROM weeks WHERE id = :weekId LIMIT 1")
    suspend fun getWeekById(weekId: Int): WeekEntity

    @Query("DELETE FROM weeks WHERE id = :weekId")
    suspend fun deleteWeekById(weekId: Int)

    @Query("SELECT * FROM days WHERE weekId = :weekId")
    fun getAllDays(weekId: Int): LiveData<List<DayEntity>>
}

@Dao
interface DayDao {

    @Query("SELECT * FROM days WHERE id = :dayId LIMIT 1")
    suspend fun getDayById(dayId: Int): DayEntity

    @Query("SELECT * FROM subjects WHERE dayId = :dayId")
    fun getAllSubjects(dayId: Int): LiveData<List<SubjectEntity>>
}

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedules")
    fun getAllSchedules(): LiveData<List<ScheduleEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchedule(schedule: ScheduleEntity)

    @Query("SELECT * FROM schedules WHERE id = :scheduleId LIMIT 1")
    suspend fun getScheduleById(scheduleId: Int): ScheduleEntity

    @Query("DELETE FROM schedules WHERE id = :scheduleId")
    suspend fun deleteScheduleById(scheduleId: Int)

    @Query("SELECT * FROM weeks WHERE scheduleId = :scheduleId")
    fun getAllWeeks(scheduleId: Int): LiveData<List<WeekEntity>>
}
