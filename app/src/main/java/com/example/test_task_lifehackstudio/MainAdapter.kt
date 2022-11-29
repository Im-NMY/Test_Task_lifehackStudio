package com.example.test_task_lifehackstudio

import com.bumptech.glide.RequestManager
import com.example.test_task_lifehackstudio.base.BaseDiffUtilItemCallback
import com.example.test_task_lifehackstudio.base.Item
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class MainAdapter(
    onClick: (Int) -> Unit,
    glide: RequestManager
) : AsyncListDifferDelegationAdapter<Item>(BaseDiffUtilItemCallback()) {

    init {
        delegatesManager.addDelegate(
            MainDelegate.institutionDelegate(
                onClick = onClick,
                glide = glide,
            )
        )
    }
}