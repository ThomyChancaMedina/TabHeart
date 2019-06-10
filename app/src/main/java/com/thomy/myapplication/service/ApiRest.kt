package com.thomy.myapplication.service

import com.thomy.myapplication.pojo.UserRequest
import retrofit2.Call
import retrofit2.http.Body

import retrofit2.http.PUT
import retrofit2.http.Path



interface ApiRest{

        @PUT("/upload/{new}.json")
        fun putUser(@Path("new") s1: String,@Body user: UserRequest):Call<UserRequest>

    }


