package com.iesam.ex_22_23_pmdm_marzo.feature.domain

import com.iesam.ex_22_23_pmdm_marzo.app.Either
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import javax.inject.Inject

class GetAdoptionsUseCase @Inject constructor(
    private val repository: AdoptionRepository
) {
    operator fun invoke(): Either<ErrorApp, List<Adoption>>{
        return repository.getAdoptions()
    }
}