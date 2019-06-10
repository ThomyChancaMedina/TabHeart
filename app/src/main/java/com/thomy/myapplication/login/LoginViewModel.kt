package com.thomy.myapplication.login

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.thomy.myapplication.ScreenState
import com.thomy.myapplication.interactor.LoginInteractor
import com.thomy.myapplication.pojo.UserRequest

//esta clase seria como  loginPresenteImpl en mvp
class LoginViewModel(private val loginInteractor: LoginInteractor): ViewModel(),
    LoginInteractor.OnLoginFinishedListener {
    override fun onError(throwable: Throwable) {
        _loginState.value = ScreenState.Rende(LoginState.WrongPassword)
    }

    override fun onSuccess(user: UserRequest?) {
        _loginState.value = ScreenState.Rende(LoginState.Success)
    }

    private val _loginState: MutableLiveData<ScreenState<LoginState>> = MutableLiveData()


    val loginState: LiveData<ScreenState<LoginState>>
        get() = _loginState

    fun onLoginClicked(username: String, password: String) {
        _loginState.value = ScreenState.Loading
        loginInteractor.login(username, password, this)
    }


}

class LoginViewModelFactory(private val loginInteractor: LoginInteractor):
        ViewModelProvider.NewInstanceFactory(){
    override fun <T: ViewModel?>create(modelClass: Class<T>): T{
        return LoginViewModel(loginInteractor) as T
    }
}