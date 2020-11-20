package com.demo.mvpkotlinandroid

class PresenterImpl (var loginView:LoginViewListener):LoginPresenter {
    override fun doLogin(userName: String) {
        //TODO("Not yet implemented")
        if (userName.equals("clpal",ignoreCase = true)){
            loginView.success(userName)
        }
        else
            loginView.failure("wrong input")
    }
}