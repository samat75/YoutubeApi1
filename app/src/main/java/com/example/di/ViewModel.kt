package com.example.di

import com.example.ui.fragments.detail.DetailViewModel
import com.example.ui.fragments.playlist.PlayListViewModelFragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


val viewModel: Module = module {
    viewModel {DetailViewModel(get()) }
    viewModel { PlayListViewModelFragment(get()) }
}