package com.iesam.ex_22_23_pmdm_marzo.feature.data

import com.iesam.ex_22_23_pmdm_marzo.app.Either
import com.iesam.ex_22_23_pmdm_marzo.app.ErrorApp
import com.iesam.ex_22_23_pmdm_marzo.app.mock.obtainAdoptionDetail
import com.iesam.ex_22_23_pmdm_marzo.app.mock.obtainAdoptions
import com.iesam.ex_22_23_pmdm_marzo.app.right
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.AdoptionDetail
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.AdoptionRepository
import javax.inject.Inject


class AdoptionsDataRepository @Inject constructor() : AdoptionRepository {

    override fun getAdoptions(): Either<ErrorApp, List<Adoption>> {
        return obtainAdoptions().map { adoptionLocalModel ->
            Adoption(
                adoptionLocalModel.id,
                adoptionLocalModel.name,
                adoptionLocalModel.shortDescription,
                adoptionLocalModel.sex,
                adoptionLocalModel.dateBorn
            )
        }.right()
    }

    override fun getDetailAdoption(adoptionId: Int): Either<ErrorApp, AdoptionDetail> {
        val adoption = obtainAdoptionDetail().first { it.id == adoptionId }
        return AdoptionDetail(
            adoption.id,
            adoption.name,
            adoption.sex,
            adoption.dateBorn,
            adoption.breed,
            adoption.size,
            adoption.description,
        ).right()
    }

}