package com.example.test_task_lifehackstudio

import com.bumptech.glide.RequestManager
import com.example.test_task_lifehackstudio.base.Item
import com.example.test_task_lifehackstudio.databinding.ItemInstitutionBinding
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.ItemInstitutionModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

object MainDelegate {

    fun institutionDelegate(
        onClick: (Int) -> Unit,
        glide: RequestManager
    ) =
        adapterDelegateViewBinding<ItemInstitutionModel, Item, ItemInstitutionBinding>({ inflater, container ->
            ItemInstitutionBinding.inflate(
                inflater,
                container,
                false
            )
        }) {
            bind {
                binding.tvTitle.text = item.name
                glide.load(item.img).fitCenter().into(binding.ivImage)
                binding.cvItem.setOnClickListener {
                    onClick.invoke(item.id.toInt())
                }
            }
        }
}