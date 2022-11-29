package com.example.test_task_lifehackstudio.domain

import com.example.test_task_lifehackstudio.base.Item

data class ItemInstitutionModel(
    val id: String,
    val name: String,
    val img: String,
): Item{
    override val itemId: Long = id.hashCode().toLong()
}

