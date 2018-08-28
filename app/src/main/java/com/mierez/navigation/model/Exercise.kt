package com.mierez.navigation.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id") val id: Int,
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "weight") val weight: Float,
        @ColumnInfo(name = "sets") val sets: Int,
        @ColumnInfo(name = "reps") val reps: Int)