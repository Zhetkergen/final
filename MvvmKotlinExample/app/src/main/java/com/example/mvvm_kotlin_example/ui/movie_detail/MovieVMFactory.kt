package com.example.mvvm_kotlin_example.ui.movie_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MovieVMFactory(val id: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return (MovieDetailViewModel(id) as T)
    }
}