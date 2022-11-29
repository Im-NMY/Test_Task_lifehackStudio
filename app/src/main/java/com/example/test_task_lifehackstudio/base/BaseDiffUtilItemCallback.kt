package com.example.test_task_lifehackstudio.base

import androidx.recyclerview.widget.DiffUtil

open class BaseDiffUtilItemCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean =
        oldItem.itemId == newItem.itemId

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.equals(newItem)
    }
}