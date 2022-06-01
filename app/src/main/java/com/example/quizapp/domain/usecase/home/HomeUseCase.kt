package com.example.quizapp.domain.usecase.home

import com.example.quizapp.domain.model.Quiz

interface HomeUseCase {
    suspend fun getQuizScore(key: String): Int
    fun getQuiz(): Quiz
    suspend fun removeUse(key:String)
}