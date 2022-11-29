package com.example.test_task_lifehackstudio.data.network.institution.model

import com.google.gson.annotations.SerializedName

data class InstitutionRemoteModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("img")
    val img: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("www")
    val url: String?,
    @SerializedName("phone")
    val phone: String?,
)
