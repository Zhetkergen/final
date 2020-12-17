package com.example.mvvm_kotlin_example.model

import com.google.gson.annotations.SerializedName


data class MovieDetails(
    @SerializedName("movie_results") val movie_results : List<MovieResult>,
)