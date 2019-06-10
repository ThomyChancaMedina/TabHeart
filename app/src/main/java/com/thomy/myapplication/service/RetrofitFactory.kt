package com.thomy.myapplication.service

import com.thomy.myapplication.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory{

    fun createWebService(): ApiRest{
        val retrofit= Retrofit.Builder()
            .baseUrl("URL")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiRest::class.java)

    }
}