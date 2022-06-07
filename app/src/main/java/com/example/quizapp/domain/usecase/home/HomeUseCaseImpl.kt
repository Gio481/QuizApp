package com.example.quizapp.domain.usecase.home

import com.example.quizapp.domain.model.Quiz
import com.example.quizapp.domain.repository.QuizRepository
import com.example.quizapp.domain.repository.QuizScoreRepository
import kotlinx.coroutines.flow.first

class HomeUseCaseImpl(
    private val repository: QuizScoreRepository,
    private val quizRepository: QuizRepository,
) : HomeUseCase {
    override suspend fun getQuizScore(key: String): Int = repository.getQuizScore(key).first() ?: 0
    override fun getQuiz(): Quiz = quizRepository.getQuiz()
    override suspend fun removeUse(key: String) = repository.removeUser(key)
}