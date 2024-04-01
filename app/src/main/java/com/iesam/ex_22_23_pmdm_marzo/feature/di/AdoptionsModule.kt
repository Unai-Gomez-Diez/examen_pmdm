package com.iesam.ex_22_23_pmdm_marzo.feature.di

import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionsDataRepository
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.AdoptionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AdoptionsModule {
    @Binds
    abstract fun bindAdoptionDataRepository(adoptionsDataRepository: AdoptionsDataRepository): AdoptionRepository
}