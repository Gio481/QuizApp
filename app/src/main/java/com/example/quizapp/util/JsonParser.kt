package com.example.quizapp.util

import com.example.quizapp.domain.model.Quiz
import com.google.gson.Gson

object JsonParser {
    fun parseJson(json: String): Quiz =
        Gson().fromJson(json, Quiz::class.java)
}