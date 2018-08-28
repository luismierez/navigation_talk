package com.mierez.navigation

import android.widget.EditText

val EditText.sanitizedText
    get() = text.toString()

val EditText.sanitizedInt
    get() = if (text.toString() == "") -1 else text.toString().toInt()

val EditText.sanitizedFloat
    get() = if (text.toString() == "") -1f else text.toString().toFloat()