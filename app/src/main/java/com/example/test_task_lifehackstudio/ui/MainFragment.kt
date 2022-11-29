package com.example.test_task_lifehackstudio.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.test_task_lifehackstudio.MainAdapter
import com.example.test_task_lifehackstudio.R
import com.example.test_task_lifehackstudio.base.viewBinding
import com.example.test_task_lifehackstudio.databinding.FragmentMainBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding { FragmentMainBinding.bind(it) }
    private val viewModel: MainViewModel by sharedViewModel()
    private val adapter by lazy {
        MainAdapter(
            glide = Glide.with(this),
            onClick = { index ->
                openInstitution()
                viewModel.processUiEvent(UiEvent.OnOpenItemClicked(index))
            }
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner,::render)
        binding.mainRecyclerView.adapter = adapter

    }
    private fun render(viewState: ViewState) {
        adapter.items = viewState.itemList
    }
    private fun openInstitution(){
        findNavController().navigate(R.id.action_mainFragment_to_institutionFragment)
    }
}