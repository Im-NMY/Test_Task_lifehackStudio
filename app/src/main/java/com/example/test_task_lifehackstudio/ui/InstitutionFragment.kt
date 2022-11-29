package com.example.test_task_lifehackstudio.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import com.example.test_task_lifehackstudio.R
import com.example.test_task_lifehackstudio.base.viewBinding
import com.example.test_task_lifehackstudio.databinding.FragmentInstitutionBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class InstitutionFragment : Fragment(R.layout.fragment_institution) {

    private val binding by viewBinding { FragmentInstitutionBinding.bind(it) }
    private val viewModel: MainViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner,::render)
        binding.description.movementMethod = ScrollingMovementMethod()
        binding.url.movementMethod = ScrollingMovementMethod()
        binding.phone.movementMethod = ScrollingMovementMethod()


    }
    private fun render(viewState: ViewState) {
        binding.title.text = viewState.institution.name
        binding.description.text = viewState.institution.description
        binding.url.text = viewState.institution.url
        binding.phone.text = viewState.institution.phone
    }
}