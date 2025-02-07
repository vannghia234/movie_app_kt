package com.example.movieappkotlin.data.models

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    val result: List<Movie>
)

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    @SerializedName("post_path") val posterPath: String?
    // more defines here
)