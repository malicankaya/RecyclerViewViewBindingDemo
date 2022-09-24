package com.malicankaya.recyclerviewviewbindingdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.malicankaya.recyclerviewviewbindingdemo.databinding.RecyclerviewItemBinding

class MainAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(private val itemBinding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(task: Task) {
            itemBinding.tvTitle.text = task.title
            itemBinding.tvTime.text = task.timeStamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            RecyclerviewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}