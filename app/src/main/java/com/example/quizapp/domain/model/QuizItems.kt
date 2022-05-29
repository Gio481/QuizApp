package com.example.quizapp.domain.model

data class QuizItems(
    val id: String,
    val quizTitle: String,
    val quizDescription: String,
    val questionsCount: Int,
    val question: List<Question>,
)