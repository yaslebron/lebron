package com.yaslebron.lamovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.yaslebron.lamovie.data.models.Movies
import com.yaslebron.lamovie.ui.MovieDetailsContract
import kotlinx.android.synthetic.main.activity_movie_detail.*

class ActivityMovieDetail : AppCompatActivity(), MovieDetailsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
    }
    override fun showMovieDetails(movie: Movies) {
        Glide.with(this@ActivityMovieDetail).load("${BuildConfig.URL_BASE_IMAGE}${movie.backdropPath}")
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(Iv_bp_detail)
        Glide.with(this@ActivityMovieDetail)
            .load("${BuildConfig.URL_BASE_IMAGE}${movie.posterpath}")
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(Iv_pp_detail)
        Tv_Name_Detail.text = movie.title
        Tv_Date_Detail.text = movie.releasedate
        TV_Detail_Detail.text = movie.overview

    }

    override fun showNoMovieDetails() {

    }
}
