package com.yaslebron.lamovie.data.source

import com.yaslebron.lamovie.data.models.Movies


interface MoviesResultListener {

    fun onMovieisLoad(list : List<Movies>)
}