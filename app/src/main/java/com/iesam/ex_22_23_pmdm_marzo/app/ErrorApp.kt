package com.iesam.ex_22_23_pmdm_marzo.app

sealed class ErrorApp {
    object DataError : ErrorApp()
}