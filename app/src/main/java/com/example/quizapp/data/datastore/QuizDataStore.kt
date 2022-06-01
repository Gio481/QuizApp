package com.example.quizapp.data.datastore

import kotlinx.coroutines.flow.Flow

interface QuizDataStore {
    suspend fun saveUser(key: String, value: String)
    fun getUser(key: String): Flow<String?>
    suspend fun saveQuizScore(key: String, value: Int)
    fun getQuizScore(key: String): Flow<Int?>
    suspend fun removeUser(key:String)
}