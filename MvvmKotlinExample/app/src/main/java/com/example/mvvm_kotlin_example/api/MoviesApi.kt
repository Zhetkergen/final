package com.example.mvvm_kotlin_example.api

import com.example.mvvm_kotlin_example.model.Movie
import io.reactivex.Single
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface MoviesApi {
    // todo https://sampleapis.com/

    @GET("{name}")
    fun getListMovies(@Path("name") name: String): Deferred<List<Movie>>

}