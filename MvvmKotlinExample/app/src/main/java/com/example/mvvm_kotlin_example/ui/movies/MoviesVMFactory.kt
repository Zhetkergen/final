package com.example.mvvm_kotlin_example.ui.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MoviesVMFactory(val name: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return (MovieListViewModel(name) as T)
    }
}