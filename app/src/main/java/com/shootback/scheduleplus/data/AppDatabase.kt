package com.shootback.scheduleplus.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shootback.scheduleplus.data.entities.DayEntity
import com.shootback.scheduleplus.data.entities.NoteEntity
import com.shootback.scheduleplus.data.entities.ScheduleEntity
import com.shootback.scheduleplus.data.entities.SubjectEntity
import com.shootback.scheduleplus.data.entities.WeekEntity

@Database(
    entities = [
        SubjectEntity::class,
        NoteEntity::class,
        WeekEntity::class,
        DayEntity::class,
        ScheduleEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun subjectDao(): SubjectDao
    abstract fun noteDao(): NoteDao
    abstract fun weekDao(): WeekDao
    abstract fun dayDao(): DayDao
    abstract fun scheduleDao(): ScheduleDao

    companion object {
        private var database: AppDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "schedule_plus_database"
        fun getInstance(application: Application): AppDatabase {
            database?.let {
                return it
            }
            synchronized(LOCK) {
                database?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                database = db
                return db
            }

        }
    }
}