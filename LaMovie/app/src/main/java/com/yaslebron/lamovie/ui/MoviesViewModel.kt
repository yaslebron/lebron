package com.yaslebron.lamovie.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yaslebron.lamovie.data.models.Movies
import com.yaslebron.lamovie.data.source.MoviesResultListener
import com.yaslebron.lamovie.data.source.Repository

class MoviesViewModel : ViewModel() {

    val popularMovies : MutableLiveData<List<Movies>> = MutableLiveData()

    fun loadMovies(){
        Repository.getPopularMovies(object : MoviesResultListener{
            override fun onMovieisLoad(list: List<Movies>) {
                popularMovies.value = list
            }
        })
    }
}