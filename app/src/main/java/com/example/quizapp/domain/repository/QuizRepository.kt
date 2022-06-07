package com.example.quizapp.domain.repository

import com.example.quizapp.domain.model.Quiz

interface QuizRepository {
    fun getQuiz():Quiz
}