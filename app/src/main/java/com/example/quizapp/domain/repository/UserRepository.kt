package com.example.quizapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun saveUser(key: String, value: String)
    fun getUser(key: String): Flow<String?>
    suspend fun removeUser(key: String)
}