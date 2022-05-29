package com.example.quizapp.data.datastore

import kotlinx.coroutines.flow.Flow

interface QuizDataStore {
    suspend fun saveQuizScore(key:String, value:Int)
    suspend fun getQuizScore(key: String): Flow<Int?>
    suspend fun clearUser()
}