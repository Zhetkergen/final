package com.example.mvvm_kotlin_example.model

import com.google.gson.annotations.SerializedName


data class Movie (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("posterURL") val posterUrl: String,
    @SerializedName("imdbId") val imdbId: String,
)