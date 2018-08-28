package com.mierez.navigation

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mierez.navigation.model.AppDatabase

val EditText.sanitizedText
    get() = text.toString()

val EditText.sanitizedInt
    get() = if (text.toString() == "") -1 else text.toString().toInt()

val EditText.sanitizedFloat
    get() = if (text.toString() == "") -1f else text.toString().toFloat()

fun AppCompatActivity.exerciseDatabase(): AppDatabase {
    return (application as ExerciseApplication).appDb
}

fun Fragment.exerciseDatabase(): AppDatabase {
    return (requireActivity().application as ExerciseApplication).appDb
}