package com.androiddevs.mvvmnewsapp

import com.androiddevs.mvvmnewsapp.Article

data class NewsReponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)