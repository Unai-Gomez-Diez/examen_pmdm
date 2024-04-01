package com.iesam.ex_22_23_pmdm_marzo.feature.presentation

import androidx.recyclerview.widget.DiffUtil
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption

class AdoptionDiffUtil: DiffUtil.ItemCallback<Adoption>() {
    override fun areItemsTheSame(oldItem: Adoption, newItem: Adoption): Boolean =
        oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: Adoption, newItem: Adoption): Boolean =
        oldItem == newItem

}
