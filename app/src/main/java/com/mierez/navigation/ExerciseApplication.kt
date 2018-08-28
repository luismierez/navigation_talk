package com.mierez.navigation

import android.app.Application
import androidx.room.Room
import com.mierez.navigation.model.AppDatabase

class ExerciseApplication : Application() {

    val appDb: AppDatabase by lazy {
        Room.databaseBuilder(this, AppDatabase::class.java, "exercise-database").build()
    }

    override fun onCreate() {
        super.onCreate()

    }
}