package com.example.test_task_lifehackstudio

import android.app.Application
import com.example.test_task_lifehackstudio.di.mainScreenModule
import com.example.test_task_lifehackstudio.di.networkModule
import com.example.test_task_lifehackstudio.di.secondScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TestApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@TestApp)
            modules(
                networkModule,
                mainScreenModule,
                secondScreenModule,
            )
        }
    }
}