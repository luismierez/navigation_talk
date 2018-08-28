package com.mierez.navigation.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Exercise::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun exerciseDao() : ExerciseDao
}