package com.yaslebron.lamovie.data.source



interface MoviesDataSource {

    fun getPopularMovies(moviesResultCallback: MoviesResultListener)

}