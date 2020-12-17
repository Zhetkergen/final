package com.example.mvvm_kotlin_example.ui.movie_detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm_kotlin_example.BuildConfig
import com.example.mvvm_kotlin_example.api.ApiUtils
import com.example.mvvm_kotlin_example.model.MovieDetails
import com.example.mvvm_kotlin_example.model.MovieResult
import com.example.mvvm_kotlin_example.ui.BaseViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.launch


class MovieDetailViewModel(val id: String) : BaseViewModel() {

    var _liveData = MutableLiveData<MovieDetails>()
    val liveData : LiveData<MovieDetails>
        get() = _liveData

    init {
        getMovieDetails(imdbId = id)
    }


    fun getMovieDetails(imdbId: String) {
        doWork {
            _liveData.postValue(ApiUtils.apiMD().getDetailById(imdbId).await())
            //_url.postValue(_url.value + _liveData.value?.movie_results?.get(0)?.poster_path)
        }
    }

}