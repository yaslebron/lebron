package com.yaslebron.lamovie.ui.topmovies

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.yaslebron.lamovie.BuildConfig
import com.yaslebron.lamovie.R
import com.yaslebron.lamovie.data.models.Movies
import com.yaslebron.lamovie.ui.MovieDetailsContract


class MoviesAdapter(val context: Context ) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    var movieData = mutableListOf<Movies>()

    fun setMovies(movies: List<Movies>) {
        movieData.clear()
        movieData.addAll(movies)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        // Inflate the custom layout
        val moviesView = inflater.inflate(R.layout.movie_list_main,
                parent, false)

        // Return a new holder instance
        return ViewHolder(moviesView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentAdapter = movieData[position]
        holder.bind(currentAdapter, context)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitle: TextView = itemView.findViewById(R.id.TV_MN_LIST)
        val movieImage: ImageView = itemView.findViewById(R.id.IV_MOVIE_LIST)

        fun bind( movies: Movies, context: Context) {
            movieTitle.text = movies.title
            context.let {
                Glide.with(context).load(BuildConfig.URL_BASE_IMAGE + movies.posterpath).into(movieImage) }

            itemView.setOnClickListener {
                
            }


        }
    }
    override fun getItemCount(): Int {
        return movieData.size
    }

}

