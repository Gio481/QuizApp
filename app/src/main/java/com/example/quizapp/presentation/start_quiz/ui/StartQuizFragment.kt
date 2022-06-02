package com.example.quizapp.presentation.start_quiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentStartQuizBinding
import com.example.quizapp.presentation.base.ui.BaseFragment
import com.example.quizapp.presentation.start_quiz.viewmodel.StartQuizViewModel
import com.example.quizapp.util.BindingInflater
import kotlin.reflect.KClass

class StartQuizFragment:BaseFragment<FragmentStartQuizBinding,StartQuizViewModel>() {

    override val inflater: BindingInflater<FragmentStartQuizBinding>
        get() = FragmentStartQuizBinding::inflate

    override fun getViewModelClass(): KClass<StartQuizViewModel> = StartQuizViewModel::class

    override fun onBindViewModel(viewModel: StartQuizViewModel) {
    }
}