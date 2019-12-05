package com.yaslebron.lamovie.ui


import com.yaslebron.lamovie.data.models.Movies

interface MovieDetailsContract {

    interface View {

        fun showMovieDetails(movies: Movies)
        fun showNoMovieDetails()

    }

    interface Presenter<V : MovieDetailsContract.View> {

        fun loadMovieDetails(id: Int)

    }
    interface ActionListener {

        fun onMovieClicked(movie: Movies)

    }

    interface Router

}