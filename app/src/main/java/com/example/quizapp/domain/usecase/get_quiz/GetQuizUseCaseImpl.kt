package com.example.quizapp.domain.usecase.get_quiz

import android.content.Context
import com.example.quizapp.domain.model.Quiz
import com.example.quizapp.util.JsonParser
import com.example.quizapp.util.RetrieveDataFromAsset

class GetQuizUseCaseImpl(private val context: Context) : GetQuizUseCase {
    override fun getQuiz(): Quiz {
        val json = RetrieveDataFromAsset.getJsonFromAssets(context, "quizzes.json")
        return JsonParser.parseJson(json)
    }
}