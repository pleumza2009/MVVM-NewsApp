package com.androiddevs.mvvmnewsapp.ui

import com.androiddevs.mvvmnewsapp.NewsReponse
import com.androiddevs.mvvmnewsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun  getBreakingNews(
        @Query("country")
        countryCode:String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsReponse>


    @GET("v2/everything")
    suspend fun  searchForNews(
        @Query("country")
        searchQuery:String ,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsReponse>
}