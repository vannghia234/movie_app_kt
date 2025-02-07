package com.example.movieappkotlin.data.remote

import okhttp3.logging.HttpLoggingInterceptor

object RetrofitInstance {
    private const val BASE_URL = "https://api.themoviedb.org/"

    // Thêm LoggingInterceptor (tuỳ chọn)
    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val
}