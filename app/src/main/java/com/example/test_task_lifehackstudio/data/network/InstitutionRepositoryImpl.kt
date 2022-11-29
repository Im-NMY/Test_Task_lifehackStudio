package com.example.test_task_lifehackstudio.data.network

import com.example.test_task_lifehackstudio.data.network.institution.InstitutionRemoteSource
import com.example.test_task_lifehackstudio.data.network.institution.model.InstitutionRemoteModel
import com.example.test_task_lifehackstudio.data.network.listinstitution.ListInstitutionRemoteSource
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.ItemInstitutionModel

class InstitutionRepositoryImpl(
    private val listSource: ListInstitutionRemoteSource,
    private val source: InstitutionRemoteSource
    ): InstitutionRepository {

    override suspend fun getListInstitution(): List<ItemInstitutionModel> {
    return listSource.getListInstitution().map { it.toDomain() }
    }

    override suspend fun getInstitution(id: String): InstitutionRemoteModel {
        return source.getInstitution(id)[0]
    }

}