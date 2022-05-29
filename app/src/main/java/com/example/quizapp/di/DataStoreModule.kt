package com.example.quizapp.di

import com.example.quizapp.data.datastore.QuizDataStore
import com.example.quizapp.data.datastore.QuizDataStoreImpl
import com.example.quizapp.data.datastore.provideDataStore
import org.koin.dsl.module

val dataStoreModule = module {
    single { provideDataStore(get()) }
    single<QuizDataStore> { QuizDataStoreImpl(get()) }
}