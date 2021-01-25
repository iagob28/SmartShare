package com.dalcim.smartshare.presentation.login

interface MainContract {

    interface Presenter {
        fun login(login: String, password: String)
    }

    interface View {
        fun goToCarList()
        fun showLoginMessageError(error: String)
    }
}