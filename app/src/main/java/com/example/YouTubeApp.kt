package com.example

import android.app.Application
import com.example.di.koinmodule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class YouTubeApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{androidContext(this@YouTubeApp)
        modules(koinmodule)
        }
    }
}