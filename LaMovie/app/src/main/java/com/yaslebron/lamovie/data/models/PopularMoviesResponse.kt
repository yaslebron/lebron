package com.yaslebron.lamovie.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PopularMoviesResponse {

    @SerializedName("page")
    @Expose
    val count:  Int? = null
    @SerializedName("total_results")
    @Expose
    val total_results:  Int? = null
    @SerializedName("total_pages")
    @Expose
    val  total_pages: Int?= null
    @SerializedName("results")
    @Expose
       var  results: List<Movies>? = null

}