package com.example.test_task_lifehackstudio.data.network

import com.example.test_task_lifehackstudio.data.network.institution.model.InstitutionRemoteModel
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.ItemInstitutionModel

interface InstitutionRepository {

    suspend fun getListInstitution(): List<ItemInstitutionModel>

    suspend fun getInstitution(id: String): InstitutionRemoteModel

}