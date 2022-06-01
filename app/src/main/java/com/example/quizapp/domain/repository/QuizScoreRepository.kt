package com.example.quizapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface QuizScoreRepository {
    suspend fun saveQuizScore(key: String, value: Int)
    fun getQuizScore(key: String): Flow<Int?>
}