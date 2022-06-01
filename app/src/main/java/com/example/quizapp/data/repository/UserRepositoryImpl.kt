package com.example.quizapp.data.repository

import com.example.quizapp.data.datastore.QuizDataStore
import com.example.quizapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl(private val dataStore: QuizDataStore) : UserRepository {

    override suspend fun saveUser(key: String, value: String) {
        dataStore.saveUser(key, value)
    }

    override fun getUser(key: String): Flow<String?> {
        return dataStore.getUser(key)
    }

    override suspend fun removeUser(key: String) {
        dataStore.removeUser(key)
    }
}