package com.thomy.myapplication.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRequest constructor(userId:Int, firstName: String, lastName: String) {


    @SerializedName("userId")
    @Expose
    val userId: Int? = null

    @SerializedName("userName")
    @Expose
    val userName: String?=null

    @SerializedName("userPassword")
    @Expose
    val userPassword: String?=null

}