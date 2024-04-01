package com.iesam.ex_22_23_pmdm_marzo.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ExamenApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}