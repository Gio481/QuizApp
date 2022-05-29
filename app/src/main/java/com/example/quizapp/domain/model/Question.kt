package com.example.quizapp.domain.model

data class Question(
    val questionsTitle: String,
    val answers: List<String>,
    val correctAnswer: String,
    val questionIndex: Int,
)
