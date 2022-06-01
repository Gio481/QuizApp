package com.example.quizapp.domain.usecase.quiz

import com.example.quizapp.domain.model.Quiz

interface QuizUseCase {
    suspend fun saveQuizScore(key: String, value: Int)
    fun getQuiz(): Quiz
}