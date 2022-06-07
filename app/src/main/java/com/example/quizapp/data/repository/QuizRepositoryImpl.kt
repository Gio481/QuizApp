package com.example.quizapp.data.repository

import android.content.Context
import com.example.quizapp.domain.model.Quiz
import com.example.quizapp.domain.repository.QuizRepository
import com.example.quizapp.util.JsonParser
import com.example.quizapp.util.RetrieveDataFromAsset

class QuizRepositoryImpl(private val context: Context) : QuizRepository {
    override fun getQuiz(): Quiz {
        val json = RetrieveDataFromAsset.getJsonFromAssets(context, "quizzes.json")
        return JsonParser.parseJson(json)
    }
}