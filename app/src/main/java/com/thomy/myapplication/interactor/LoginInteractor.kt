package com.thomy.myapplication.interactor

import android.util.Log
import android.widget.TextView
import com.thomy.myapplication.pojo.UserRequest
import com.thomy.myapplication.service.ApiRest
import com.thomy.myapplication.service.RetrofitFactory


class LoginInteractor {
//    val TAG = LoginInteractor::class.java.simpleName.toString()





    //aqui esdonde se cambia para poder loguear al user
    interface OnLoginFinishedListener {

        fun onError(throwable: Throwable)
        fun onSuccess(user: UserRequest?)

    }

    fun login(username: String, password: String, listener: OnLoginFinishedListener){



    }




}




