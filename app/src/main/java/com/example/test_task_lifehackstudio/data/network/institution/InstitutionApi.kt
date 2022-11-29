package com.example.test_task_lifehackstudio.data.network.institution

import com.example.test_task_lifehackstudio.data.network.institution.model.InstitutionRemoteModel
import com.example.test_task_lifehackstudio.data.network.listinstitution.model.ItemInstitutionRemoteModel
import retrofit2.http.GET
import retrofit2.http.Query

interface InstitutionApi {
    @GET("test_task/test.php")
    suspend fun getInstitution(
        @Query("id") id: String
    ): List<InstitutionRemoteModel>
}