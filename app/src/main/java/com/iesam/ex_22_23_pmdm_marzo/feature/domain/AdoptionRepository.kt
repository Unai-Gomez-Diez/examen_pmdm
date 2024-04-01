package com.iesam.ex_22_23_pmdm_marzo.feature.domain

import com.iesam.ex_22_23_pmdm_marzo.app.Either
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp

interface AdoptionRepository {

    fun getAdoptions(): Either<ErrorApp, List<Adoption>>

    fun getDetailAdoption(adoptionId: Int): Either<ErrorApp, AdoptionDetail>

}