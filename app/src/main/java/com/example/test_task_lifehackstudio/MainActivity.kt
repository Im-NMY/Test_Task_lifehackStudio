package com.example.test_task_lifehackstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test_task_lifehackstudio.ui.MainFragment
import com.example.test_task_lifehackstudio.ui.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}