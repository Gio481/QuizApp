package com.example.quizapp.presentation.home.ui

import com.example.quizapp.databinding.FragmentHomeBinding
import com.example.quizapp.presentation.base.ui.BaseFragment
import com.example.quizapp.presentation.home.viewmodel.HomeViewModel
import com.example.quizapp.util.BindingInflater
import kotlin.reflect.KClass

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val inflater: BindingInflater<FragmentHomeBinding>
        get() = FragmentHomeBinding::inflate

    override fun getViewModelClass(): KClass<HomeViewModel> = HomeViewModel::class

    override fun onBindViewModel(viewModel: HomeViewModel) {
    }
}