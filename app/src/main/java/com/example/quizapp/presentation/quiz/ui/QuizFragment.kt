package com.example.quizapp.presentation.quiz.ui

import com.example.quizapp.databinding.FragmentQuizBinding
import com.example.quizapp.presentation.base.ui.BaseFragment
import com.example.quizapp.presentation.quiz.viewmodel.QuizViewModel
import com.example.quizapp.util.BindingInflater
import kotlin.reflect.KClass

class QuizFragment : BaseFragment<FragmentQuizBinding, QuizViewModel>() {

    override val inflater: BindingInflater<FragmentQuizBinding>
        get() = FragmentQuizBinding::inflate

    override fun getViewModelClass(): KClass<QuizViewModel> = QuizViewModel::class

    override fun onBindViewModel(viewModel: QuizViewModel) {}
}