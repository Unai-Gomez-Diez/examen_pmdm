package com.iesam.ex_22_23_pmdm_marzo.feature.presentation.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import com.iesam.ex_22_23_pmdm_marzo.feature.presentation.AdoptionDiffUtil

class AdoptionsAdapter : ListAdapter<Adoption,AdoptionViewHolder>(AdoptionDiffUtil()) {
    private var onClickDetail: ((Int) -> Unit)? = null

    fun setOnClickDetail(onClickDetail: ((Int) -> Unit)) {
        this.onClickDetail = onClickDetail
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdoptionViewHolder {
        val viewAdoption = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_adoption, parent, false)
        return AdoptionViewHolder(viewAdoption)
    }

    override fun getItemCount(): Int = currentList.size

    override fun onBindViewHolder(holder: AdoptionViewHolder, position: Int) {
        holder.bindAdoption(currentList[position], onClickDetail)
    }


}