package com.example.plantfarmapp.di

import android.app.Application
import com.example.plantfarmapp.model.abstractions.IFieldService
import com.example.plantfarmapp.model.services.FieldsService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService()
    }

    companion object{
        lateinit var fieldsService: IFieldService
    }
}