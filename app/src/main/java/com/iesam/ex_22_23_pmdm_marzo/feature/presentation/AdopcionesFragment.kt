package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.databinding.FragmentAdoptionsBinding
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter.AdoptionsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AdopcionesFragment: Fragment() {

    private var _binding: FragmentAdoptionsBinding? = null
    private val binding get() = _binding!!

    private val adoptionsAdapter = AdoptionsAdapter()

    private val viewModel by viewModels<AdopcionesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdoptionsBinding.inflate(inflater, container, false)
        setupView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObserver()
        viewModel.getAdoptions()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupView() {
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.VERTICAL,
                    false
                )
                addItemDecoration(
                    DividerItemDecoration(
                        context,
                        LinearLayoutManager.VERTICAL
                    )
                )
                adapter = adoptionsAdapter
            }
            layoutParent.apply {
                toolbar.mainToolbar.apply {
                    title = "Adopciones"

                }
            }
        }
    }

    private fun setupObserver(){
        val observer = Observer<AdopcionesViewModel.AdoptionUiState>{
            if (it.error != null){
                showError(it.error)
            }else{
                val listAdoption = it.adoptionsList
                adoptionsAdapter.submitList(listAdoption)

            }
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun showError(error: ErrorApp) {
        //TODO
    }
}