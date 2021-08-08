package com.example.di

import com.example.remote.RemoteDataSource
import org.koin.dsl.module

val RemoteDataSource = module {
    single { RemoteDataSource(get()) }
}