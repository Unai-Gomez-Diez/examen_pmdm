package com.iesam.ex_22_23_pmdm_marzo.feature.domain

data class Adoption(
    val id: Int,
    val namePet: String,
    val shortDescription: String,
    val sex: String,
    val dateBorn: String
)

data class AdoptionDetail(
    val id: Int,
    val namePet: String,
    val sex: String,
    val dateBorn: String,
    val bread: String,
    val size: String,
    val description: String
)