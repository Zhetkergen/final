package com.example.mvvm_kotlin_example.ui.movies

import android.util.Log
import com.example.mvvm_kotlin_example.model.Movie
import com.example.mvvm_kotlin_example.ui.BaseViewModel


class MovieListItemViewModel(val movie: Movie) : BaseViewModel() {

    val imageUrl = movie.posterUrl
    val title = movie.title

    init {
//        Log.e(this.javaClass.simpleName, "poster url is ${movie.posterUrl} & title is ${movie.title}")
    }

}