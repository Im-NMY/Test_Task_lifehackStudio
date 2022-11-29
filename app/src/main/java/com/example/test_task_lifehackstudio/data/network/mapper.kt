package com.example.test_task_lifehackstudio.data.network

import com.example.test_task_lifehackstudio.data.network.institution.model.InstitutionRemoteModel
import com.example.test_task_lifehackstudio.data.network.listinstitution.model.ItemInstitutionRemoteModel
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.ItemInstitutionModel

fun ItemInstitutionRemoteModel.toDomain() = ItemInstitutionModel(
    id = id,
    name = name,
    img = img,
)

fun InstitutionRemoteModel.toDomain() = InstitutionModel(
    id = id,
    name = name,
    img = img,
    description = description,
    url = url,
    phone = phone
)

