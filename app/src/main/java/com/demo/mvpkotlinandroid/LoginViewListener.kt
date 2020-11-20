package com.demo.mvpkotlinandroid

interface LoginViewListener {

    fun success(result:String)
    fun failure(result:String)
}