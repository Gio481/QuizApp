package com.example.quizapp.di

import com.example.quizapp.domain.usecase.home.HomeUseCase
import com.example.quizapp.domain.usecase.home.HomeUseCaseImpl
import com.example.quizapp.domain.usecase.quiz.QuizUseCase
import com.example.quizapp.domain.usecase.quiz.QuizUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<HomeUseCase> { HomeUseCaseImpl(get(), get()) }
    single<QuizUseCase> { QuizUseCaseImpl(get(), get()) }
}