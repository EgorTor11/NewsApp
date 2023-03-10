package com.taranovegor91.newsapp.di

import com.taranovegor91.newsapp.data.api.NewsApiService
import com.taranovegor91.newsapp.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun baseUrl() = BASE_URL

    @Provides
    fun logging() = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)
    @Provides
    fun okHttpClient() =OkHttpClient.Builder()
        .addInterceptor(logging())
        .build()

    @Provides
    fun provideRetrofit(baseUrl:String) : NewsApiService= Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient())
        .build()
        .create(NewsApiService::class.java)


}