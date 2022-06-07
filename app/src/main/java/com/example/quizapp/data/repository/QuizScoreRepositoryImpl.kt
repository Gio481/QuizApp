package com.example.quizapp.data.repository

import com.example.quizapp.data.datastore.QuizDataStore
import com.example.quizapp.domain.repository.QuizScoreRepository
import kotlinx.coroutines.flow.Flow

class QuizScoreRepositoryImpl(private val dataStore: QuizDataStore) : QuizScoreRepository {

    override suspend fun saveQuizScore(key: String, value: Int) {
        dataStore.saveQuizScore(key, value)
    }

    override fun getQuizScore(key: String): Flow<Int?> {
        return dataStore.getQuizScore(key)
    }

    override suspend fun removeUser(key: String) {
        dataStore.removeUser(key)
    }
}