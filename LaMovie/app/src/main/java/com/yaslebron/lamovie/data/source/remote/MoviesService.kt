package com.yaslebron.lamovie.data.source.remote


import com.yaslebron.lamovie.BuildConfig
import com.yaslebron.lamovie.data.models.PopularMoviesResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BuildConfig.URL_BASE)
        .build()

interface MoviesApiService {

    @GET("movie/popular?api_key=bc89d8a3d1bc2c261fed02233efcbfce&language=es-ES&page=2")
    fun getPopularMovies(): Call<PopularMoviesResponse>

}

object PopularMoviesApi {

    val retrofitService : MoviesApiService by lazy {
        retrofit.create(MoviesApiService::class.java) }

}