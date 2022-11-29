package com.example.test_task_lifehackstudio.data.network.listinstitution.model

import com.google.gson.annotations.SerializedName

data class ItemInstitutionRemoteModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("img")
    val img: String,
)
