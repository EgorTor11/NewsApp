package com.taranovegor91.newsapp.data.models

data class NewsRespons(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)