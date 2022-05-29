package com.example.quizapp

import android.app.Application
import com.example.quizapp.di.dataStoreModule
import com.example.quizapp.di.repositoryModule
import com.example.quizapp.di.useCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(
                dataStoreModule,
                repositoryModule,
                useCaseModule
            ))
        }
    }
}