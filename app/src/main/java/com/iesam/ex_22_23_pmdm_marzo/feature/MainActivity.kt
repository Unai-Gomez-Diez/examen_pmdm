package com.iesam.ex_22_23_pmdm_marzo.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iesam.ex_22_23_pmdm_marzo.R
import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionsDataRepository
import com.iesam.ex_22_23_pmdm_marzo.feature.presentation.AdopcionesFragment
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val repo = AdoptionsDataRepository()
        repo.getAdoptions()
        repo.getDetailAdoption(1)*/
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, AdopcionesFragment())
            .commit()

    }
}