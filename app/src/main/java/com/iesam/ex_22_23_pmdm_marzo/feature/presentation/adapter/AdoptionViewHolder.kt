package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.iesam.ex_22_23_pmdm_marzo.databinding.ViewItemAdoptionBinding
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption

class AdoptionViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    val itemAdoption = ViewItemAdoptionBinding.bind(view)

    fun bindAdoption(adoption: Adoption, onClickDetail: ((Int)-> Unit)?){
        itemAdoption.apply {
            name.text = adoption.namePet
            dateBorn.text = adoption.dateBorn
            bio.text = adoption.shortDescription
            genderText.text = adoption.sex
            onClickDetail?.let {
                view.setOnClickListener {
                    onClickDetail(adoption.id)
                }
            }
        }
    }
}