package com.example.prakdatabase

import android.app.Application
import com.example.prakdatabase.repositori.ContainerApp
import com.example.prakdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}