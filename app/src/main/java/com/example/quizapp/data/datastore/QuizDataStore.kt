package com.example.quizapp.data.datastore

import kotlinx.coroutines.flow.Flow

interface QuizDataStore {
    suspend fun saveQuizScore(key: String, value: Int)
    fun getQuizScore(key: String): Flow<Int?>
    suspend fun removeUser(key:String)
}