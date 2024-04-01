package com.iesam.ex_22_23_pmdm_marzo.feature.data

import com.google.gson.annotations.SerializedName

data class AdoptionLocalModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("sex") val sex: String,
    @SerializedName("date_born") val dateBorn: String,
    @SerializedName("url_image") val urlImage: String,
    @SerializedName("short_description") val shortDescription: String,
)

data class AdoptionDetailLocalModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("breed") val breed: String,
    @SerializedName("sex") val sex: String,
    @SerializedName("date_born") val dateBorn: String,
    @SerializedName("size") val size: String,
    @SerializedName("url_image") val urlImage: String,
    @SerializedName("gallery") val gallery: List<String>,
    @SerializedName("short_description") val shortDescription: String,
)