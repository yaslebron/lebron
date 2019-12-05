package com.yaslebron.lamovie.data.source

import android.util.Log

import com.yaslebron.lamovie.data.models.PopularMoviesResponse
import com.yaslebron.lamovie.data.source.remote.PopularMoviesApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Repository : MoviesDataSource {

    override fun getPopularMovies (moviesResultCallback: MoviesResultListener) {
        val response = PopularMoviesApi.retrofitService.getPopularMovies()
                .enqueue(object : Callback<PopularMoviesResponse> {
                    override fun onFailure(call: Call<PopularMoviesResponse>, t: Throwable) {
                        Log.e("",t.message ?:"")
                    }

                    override fun onResponse(call: Call<PopularMoviesResponse>, response: Response<PopularMoviesResponse>) {
                        val ppularMovies = response.body()?.results
                        ppularMovies?.let { moviesResultCallback.onMovieisLoad(it) }
                    }
                })
    }

}