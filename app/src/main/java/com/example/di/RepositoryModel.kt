package com.example.di

import com.example.repository.Repository
import org.koin.dsl.module

val repositoryModule = module {
    single { Repository(get()) }
}