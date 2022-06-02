package com.example.quizapp.presentation.quiz.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.quizapp.R
import com.example.quizapp.databinding.QuizAnswerCustomViewBinding
import com.example.quizapp.util.extension.isVisible
import com.example.quizapp.util.extension.setBackgroundTint

class QuizAnswerCustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding =
        QuizAnswerCustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    var answer: String? = null
        set(value) {
            binding.answerTextView.text = value
            field = value
        }

    init {
        val typedArray = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.QuizAnswerCustomView,
            defStyle,
            0
        )

        answer = typedArray.getString(R.styleable.QuizAnswerCustomView_answer)
        typedArray.recycle()
    }

    fun checkAnswer() {
        with(binding) {
            checkAnswerButton.setBackgroundTint(context, R.color.yellow_500)
            checkIconImageView.isVisible(true)
        }
    }

    fun removeCheckOnAnswer() {
        with(binding) {
            checkAnswerButton.setBackgroundTint(context, R.color.grey_500)
            checkIconImageView.isVisible(false)
        }
    }
}