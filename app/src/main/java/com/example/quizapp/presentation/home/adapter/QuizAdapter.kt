package com.example.quizapp.presentation.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.QuizItemLayoutBinding
import com.example.quizapp.domain.model.QuizItems
import com.example.quizapp.util.ItemDiffUtil

class QuizAdapter : ListAdapter<QuizItems, QuizAdapter.ViewHolder>(ItemDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = QuizItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = ViewHolder(view)
        view.quizItemCustomView.setListener(getItem(viewHolder.adapterPosition))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    class ViewHolder(private val binding: QuizItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(quizItem: QuizItems) {
            with(binding.quizItemCustomView) {
                quizTitle = quizItem.quizTitle
                quizDescription = quizItem.quizDescription
            }
        }
    }

}