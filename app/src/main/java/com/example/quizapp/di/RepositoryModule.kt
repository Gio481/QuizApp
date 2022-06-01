package com.example.quizapp.di

import com.example.quizapp.data.repository.QuizScoreRepositoryImpl
import com.example.quizapp.data.repository.UserRepositoryImpl
import com.example.quizapp.domain.repository.QuizScoreRepository
import com.example.quizapp.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<QuizScoreRepository> { QuizScoreRepositoryImpl(get()) }
    single<UserRepository> { UserRepositoryImpl(get()) }
}