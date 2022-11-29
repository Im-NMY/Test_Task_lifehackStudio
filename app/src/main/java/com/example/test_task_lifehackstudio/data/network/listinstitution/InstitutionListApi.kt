package com.example.test_task_lifehackstudio.data.network.listinstitution

import com.example.test_task_lifehackstudio.data.network.listinstitution.model.ItemInstitutionRemoteModel
import retrofit2.http.GET

interface InstitutionListApi {

    @GET("test_task/test.php")
    suspend fun getListInstitution(): List<ItemInstitutionRemoteModel>
}