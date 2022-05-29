package com.example.quizapp.domain.usecase.get_quiz

import com.example.quizapp.domain.model.Quiz

interface GetQuizUseCase {
    fun getQuiz(): Quiz
}