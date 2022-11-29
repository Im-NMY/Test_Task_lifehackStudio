package com.example.test_task_lifehackstudio.data.network.listinstitution

import com.example.test_task_lifehackstudio.data.network.listinstitution.model.ItemInstitutionRemoteModel

class ListInstitutionRemoteSource(private val api: InstitutionListApi) {

    suspend fun getListInstitution(): List<ItemInstitutionRemoteModel> = api.getListInstitution()
}