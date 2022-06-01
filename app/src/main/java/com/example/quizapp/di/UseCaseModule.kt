package com.example.quizapp.di

import com.example.quizapp.domain.usecase.get_quiz.GetQuizUseCase
import com.example.quizapp.domain.usecase.get_quiz.GetQuizUseCaseImpl
import com.example.quizapp.domain.usecase.get_score.GetQuizScoreUseCase
import com.example.quizapp.domain.usecase.get_score.GetQuizScoreUseCaseImpl
import com.example.quizapp.domain.usecase.get_user.GetUserUseCase
import com.example.quizapp.domain.usecase.get_user.GetUserUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<GetQuizScoreUseCase> { GetQuizScoreUseCaseImpl(get()) }
    single<GetQuizUseCase> { GetQuizUseCaseImpl(get()) }
    single<GetUserUseCase> { GetUserUseCaseImpl(get()) }
}