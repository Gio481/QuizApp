package com.example.quizapp.domain.usecase.get_user

interface GetUserUseCase {
    suspend fun saveUser(key: String, value: String)
    suspend fun getUser(key: String): String?
    suspend fun removeUser(key: String)
}