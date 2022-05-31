package com.example.quizapp.presentation.quiz.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.QuizAnswerItemLayoutBinding
import com.example.quizapp.util.ItemDiffUtil

class QuizAnswersAdapter : ListAdapter<String, QuizAnswersAdapter.ViewHolder>(ItemDiffUtil()) {

    private var selectedPosition: Int? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = QuizAnswerItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = ViewHolder(view)
        view.root.setOnClickListener {
            changeItems(viewHolder.adapterPosition)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position), selectedPosition)
    }

    class ViewHolder(private val binding: QuizAnswerItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(quizItem: String, selectedPosition: Int?) {
            with(binding.quizAnswerCustomView) {
                if (selectedPosition == adapterPosition) checkAnswer() else removeCheckOnAnswer()
                answer = quizItem
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun changeItems(position: Int) {
        selectedPosition = position
        notifyDataSetChanged()
    }
}