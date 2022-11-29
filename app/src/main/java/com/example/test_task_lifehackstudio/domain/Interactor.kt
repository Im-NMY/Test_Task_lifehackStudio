package com.example.test_task_lifehackstudio.domain

import com.example.test_task_lifehackstudio.base.attempt
import com.example.test_task_lifehackstudio.data.network.InstitutionRepository
import com.example.test_task_lifehackstudio.data.network.toDomain

class Interactor(
    private val listRepository: InstitutionRepository,
    private val repository: InstitutionRepository
) {

    suspend fun getListInstitution() = attempt { listRepository.getListInstitution() }

    suspend fun getInstitution(id: String) = attempt { repository.getInstitution(id = id).toDomain() }
}