package com.yaslebron.lamovie.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Movies {

    @SerializedName("popularity")
    @Expose
    var popularity: Float? = null
    @SerializedName("vote_count")
    @Expose
    var votecount: Int? = null
    @SerializedName("video")
    @Expose
    var video: Boolean? = null
    @SerializedName("poster_path")
    @Expose
    var posterpath: String?= null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("adult")
    @Expose
    var adult: Boolean? = null
    @SerializedName("backdrop_path")
    @Expose
    var backdropPath: String?= null
    @SerializedName("original_language")
    @Expose
    var originalLanguage: String? = null
    @SerializedName("original_title")
    @Expose
    var originalTitle: String? = null
    @SerializedName("genre_ids")
    @Expose
    var  genreIds: Array<Int>? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("vote_average")
    @Expose
    var voteAverage: Float? = null
    @SerializedName("overview")
    @Expose
    var  overview: String? =null
    @SerializedName("release_date")
    @Expose
   var releasedate: String? = null



}