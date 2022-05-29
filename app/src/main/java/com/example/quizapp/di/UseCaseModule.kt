package com.example.quizapp.di

import com.example.quizapp.domain.usecase.GetQuizScoreUseCase
import com.example.quizapp.domain.usecase.GetQuizScoreUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<GetQuizScoreUseCase> { GetQuizScoreUseCaseImpl(get()) }
}