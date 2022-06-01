package com.example.quizapp.domain.usecase.get_score

import com.example.quizapp.domain.repository.QuizScoreRepository
import kotlinx.coroutines.flow.first

class GetQuizScoreUseCaseImpl(private val repository: QuizScoreRepository) : GetQuizScoreUseCase {
    override suspend fun saveQuizScore(key: String, value: Int) = repository.saveQuizScore(key, value)
    override suspend fun getQuizScore(key: String): Int? = repository.getQuizScore(key).first()
}