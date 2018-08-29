package com.mierez.navigation.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Exercise(
        @PrimaryKey
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "weight") val weight: Float,
        @ColumnInfo(name = "sets") val sets: Int,
        @ColumnInfo(name = "reps") val reps: Int) : Parcelable