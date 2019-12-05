package com.yaslebron.lamovie.ui.topmovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yaslebron.lamovie.R
import com.yaslebron.lamovie.data.models.Movies
import com.yaslebron.lamovie.ui.MoviesViewModel
import dagger.android.support.DaggerAppCompatActivity


class TopMovieActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var currentAdapter: MoviesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.Rv_moview_lis)
        recyclerView?.layoutManager = GridLayoutManager(this,3)
        currentAdapter = MoviesAdapter(this)
        recyclerView?.adapter = currentAdapter

        val model = ViewModelProviders.of(this)[MoviesViewModel::class.java]
        model.popularMovies.observe(this, Observer<List<Movies>> { movies ->
            currentAdapter?.setMovies(movies)
        })

        model.loadMovies()
    }
}
