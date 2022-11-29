package com.example.test_task_lifehackstudio.di

import android.util.Log
import com.example.test_task_lifehackstudio.data.network.InstitutionRepository
import com.example.test_task_lifehackstudio.data.network.InstitutionRepositoryImpl
import com.example.test_task_lifehackstudio.data.network.institution.InstitutionApi
import com.example.test_task_lifehackstudio.data.network.institution.InstitutionRemoteSource
import com.example.test_task_lifehackstudio.data.network.listinstitution.InstitutionListApi
import com.example.test_task_lifehackstudio.data.network.listinstitution.ListInstitutionRemoteSource
import com.example.test_task_lifehackstudio.domain.Interactor
import com.example.test_task_lifehackstudio.ui.MainViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://lifehack.studio/"

val networkModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor { massage ->
                Log.d("OkHttp", massage)
            }.apply {
                setLevel(HttpLoggingInterceptor.Level.BODY)
            }
        )
            .build()
    }
    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get<OkHttpClient>())
            .build()
    }
}

val mainScreenModule = module {

    single<InstitutionListApi> {
        get<Retrofit>().create(InstitutionListApi::class.java)
    }

    single<ListInstitutionRemoteSource> {
        ListInstitutionRemoteSource(api = get())
    }

    single<InstitutionRepository> {
        InstitutionRepositoryImpl(listSource = get(), source = get())
    }

    single<Interactor> {
        Interactor(repository = get(), listRepository = get())
    }
    viewModel {
        MainViewModel(interactor = get())
    }
}

val secondScreenModule = module {


    single<InstitutionApi> {
        get<Retrofit>().create(InstitutionApi::class.java)
    }

    single<InstitutionRemoteSource> {
        InstitutionRemoteSource(api = get())
    }


    single<InstitutionRepository> {
        InstitutionRepositoryImpl(listSource = get(), source = get())
    }

    single<Interactor> {
        Interactor(repository = get(), listRepository = get())
    }
    viewModel {
        MainViewModel(interactor = get())
    }
}