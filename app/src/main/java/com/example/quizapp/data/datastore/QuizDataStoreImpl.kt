package com.example.quizapp.data.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class QuizDataStoreImpl(private val dataStore: DataStore<Preferences>) : QuizDataStore {
    override suspend fun saveUser(key: String, value: String) {
        dataStore.edit {
            it[stringPreferencesKey(key)] = value
        }
    }

    override fun getUser(key: String): Flow<String?> {
        val preferences = dataStore.data.map {
            it[stringPreferencesKey(key)]
        }
        return preferences
    }

    override suspend fun saveQuizScore(key: String, value: Int) {
        dataStore.edit {
            it[intPreferencesKey(key)] = value
        }
    }

    override fun getQuizScore(key: String): Flow<Int?> {
        val preferences = dataStore.data.map {
            it[intPreferencesKey(key)]
        }
        return preferences
    }

    override suspend fun removeUser(key: String) {
        dataStore.edit {
            it.remove(stringPreferencesKey(key))
        }
    }
}