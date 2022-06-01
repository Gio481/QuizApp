package com.example.quizapp.domain.usecase.quiz

import com.example.quizapp.domain.model.Quiz
import com.example.quizapp.domain.repository.QuizRepository
import com.example.quizapp.domain.repository.QuizScoreRepository

class QuizUseCaseImpl(
    private val quizScoreRepository: QuizScoreRepository,
    private val quizRepository: QuizRepository,
):QuizUseCase {
    override suspend fun saveQuizScore(key: String, value: Int) = quizScoreRepository.saveQuizScore(key, value)
    override fun getQuiz(): Quiz = quizRepository.getQuiz()
}