package com.dalcim.smartshare.presentation.login

import com.dalcim.smartshare.data.repository.UserRepository

class MainPresenter(
    private val view: MainContract.View,
    private val repository: UserRepository
) : MainContract.Presenter {

    override fun login(login: String, password: String) {
        when {
            login.contains("@").not() -> {
                view.showLoginMessageError("Email inválido")
            }
            password.length < 4 -> {
                view.showLoginMessageError("Senha muito curta")
            }
            else -> {
                val user = repository.login(login, password)

                if (user == null) {
                    view.showLoginMessageError("Senha ou login invalido")
                } else {
                    view.goToCarList()
                }
            }
        }
    }

}