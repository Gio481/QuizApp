package com.example.quizapp.di

import com.example.quizapp.data.repository.QuizRepositoryImpl
import com.example.quizapp.data.repository.QuizScoreRepositoryImpl
import com.example.quizapp.domain.repository.QuizRepository
import com.example.quizapp.domain.repository.QuizScoreRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<QuizScoreRepository> { QuizScoreRepositoryImpl(get()) }
    single<QuizRepository> { QuizRepositoryImpl(get()) }
}