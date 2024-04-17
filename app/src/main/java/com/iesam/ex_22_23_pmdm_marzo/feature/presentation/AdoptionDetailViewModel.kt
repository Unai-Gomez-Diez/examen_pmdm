package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.AdoptionDetail
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.GetAdoptionDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Error
import javax.inject.Inject

@HiltViewModel
class AdoptionDetailViewModel @Inject constructor(
    private val getAdoptionDetailUseCase: GetAdoptionDetailUseCase
): ViewModel() {
    private val _uiState = MutableLiveData<AdoptionDetailUiState>()
    private val uiState: LiveData<AdoptionDetailUiState> = _uiState

    fun getAdoption(id: Int){
        _uiState.value = AdoptionDetailUiState(isLoading = true)
        viewModelScope.launch(Dispatchers.IO) {
            getAdoptionDetailUseCase.invoke(id).fold(
                {responseError(it)},
                {responseSucces(it)}
            )
        }

    }
    private fun responseError(error: ErrorApp){
        _uiState.postValue(AdoptionDetailUiState(isLoading = false, errorApp = error))
    }
    private fun responseSucces(adoption: AdoptionDetail){
        _uiState.postValue(AdoptionDetailUiState(adoptionDetail = adoption))
    }

    data class AdoptionDetailUiState(
        private val isLoading: Boolean = false,
        private val errorApp: ErrorApp? = null,
        private val adoptionDetail: AdoptionDetail? = null

    )
}