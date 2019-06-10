package com.thomy.myapplication

sealed class ScreenState<out T>{
    object Loading : ScreenState<Nothing>()
    class Rende<T>(val renderState: T): ScreenState<T>()
}