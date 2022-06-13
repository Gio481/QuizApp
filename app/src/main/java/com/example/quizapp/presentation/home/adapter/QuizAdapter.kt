package com.example.quizapp.presentation.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.QuizItemLayoutBinding
import com.example.quizapp.domain.model.QuizItems
import com.example.quizapp.util.ItemDiffUtil
import com.example.quizapp.util.OnItemCLickListener

class QuizAdapter : ListAdapter<QuizItems, QuizAdapter.ViewHolder>(ItemDiffUtil()) {

    lateinit var listener: OnItemCLickListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = QuizItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = ViewHolder(view)
        view.startQuizButton.setOnClickListener {
            listener(getItem(viewHolder.adapterPosition))
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    class ViewHolder(private val binding: QuizItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(quizItem: QuizItems) {
            with(binding) {
                quizTitleTextView.text = quizItem.quizTitle
                quizDescriptionTextView.text = quizItem.quizDescription
            }
        }
    }

}