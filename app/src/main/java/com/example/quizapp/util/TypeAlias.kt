package com.example.quizapp.util

import android.view.LayoutInflater
import android.view.ViewGroup

typealias BindingInflater<T> = (inflater: LayoutInflater, container: ViewGroup?, attachRoot: Boolean) -> T