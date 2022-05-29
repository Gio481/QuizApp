package com.example.quizapp.presentation.home.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.quizapp.R
import com.example.quizapp.databinding.QuizItemCustomViewBinding
import com.example.quizapp.domain.model.QuizItems

class QuizItemCustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding =
        QuizItemCustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    lateinit var onItemClick: (quiz: QuizItems) -> Unit

    var quizTitle: String? = null
        set(value) {
            binding.quizTitleTextView.text = value
            field = value
        }

    var quizDescription: String? = null
        set(value) {
            binding.quizDescriptionTextView.text = value
            field = value
        }

    init {
        val typedArray = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.QuizItemCustomView,
            defStyle,
            0
        )

        quizTitle = typedArray.getString(R.styleable.QuizItemCustomView_quizTitle)
        quizDescription = typedArray.getString(R.styleable.QuizItemCustomView_quizDescription)
        typedArray.recycle()
    }

    fun setListener(quiz: QuizItems) {
        binding.startQuizButton.setOnClickListener {
            onItemClick(quiz)
        }
    }
}