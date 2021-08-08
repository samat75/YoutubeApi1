package com.example.di

import com.example.loco.network.networkModule

val koinmodule = listOf(
networkModule,
repositoryModule,
RemoteDataSource,
    viewModel
)