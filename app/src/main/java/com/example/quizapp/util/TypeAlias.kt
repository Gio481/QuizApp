package com.example.quizapp.util

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.quizapp.domain.model.QuizItems

typealias BindingInflater<T> = (inflater: LayoutInflater, container: ViewGroup?, attachRoot: Boolean) -> T
typealias OnItemCLickListener = (quiz:QuizItems)->Unit