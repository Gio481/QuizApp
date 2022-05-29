package com.example.quizapp.domain.usecase

interface GetQuizScoreUseCase {
    suspend fun saveQuizScore(key: String, value: Int)
    suspend fun getQuizScore(key: String): Int?
    suspend fun clearUser()
}