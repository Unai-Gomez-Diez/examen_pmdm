package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.GetAdoptionDetailUseCase
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.GetAdoptionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class AdopcionesViewModel(
    private val getAdoptionsUseCase: GetAdoptionsUseCase
): ViewModel() {
    private val _uistate = MutableLiveData<AdoptionUiState>()
    val uiState: LiveData<AdoptionUiState> = _uistate

    fun getAdoptions(){
        _uistate.value = (AdoptionUiState(isloading = true))
        viewModelScope.launch(Dispatchers.IO){
            getAdoptionsUseCase.invoke().fold(
                {responseError(it)},
                {responseSuccess(it)}
            )
        }
    }

    private fun responseError(errorApp: ErrorApp) =
        _uistate.postValue(AdoptionUiState(false))

    private fun responseSuccess(adoptions: List<Adoption>) {
        _uistate.postValue(AdoptionUiState(adoptionsList = adoptions))
    }
    data class AdoptionUiState(
        val isloading: Boolean = false,
        val error: ErrorApp? = null,
        val adoptionsList: List<Adoption>? = null
    )
}