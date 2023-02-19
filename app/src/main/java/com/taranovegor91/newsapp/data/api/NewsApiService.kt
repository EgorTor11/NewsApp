package com.taranovegor91.newsapp.data.api

import com.taranovegor91.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q")query: String,
        @Query("page")page: Int=1,
        @Query("apiKey")apiKey: String=API_KEY
    )
    @GET("/v2/top-headlines")
    suspend fun getTopHeadLines(
        @Query("country")countryCod: String="ru",
        @Query("page")page: Int=1,
        @Query("apiKey")apiKey: String=API_KEY
    )
}