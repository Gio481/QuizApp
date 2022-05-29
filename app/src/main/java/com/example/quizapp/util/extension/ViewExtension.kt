package com.example.quizapp.util.extension

import android.content.Context
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible

fun View.isVisible(boolean: Boolean) {
    this.isVisible = boolean
}

fun Button.setBackgroundTint(context: Context, color: Int) {
    this.background.setTint(ContextCompat.getColor(context, color))
}