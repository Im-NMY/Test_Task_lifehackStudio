package com.example.test_task_lifehackstudio.data.network.institution

import com.example.test_task_lifehackstudio.data.network.institution.model.InstitutionRemoteModel

class InstitutionRemoteSource(private val api: InstitutionApi) {

    suspend fun getInstitution(id: String): List<InstitutionRemoteModel>  = api.getInstitution(id = id)
}