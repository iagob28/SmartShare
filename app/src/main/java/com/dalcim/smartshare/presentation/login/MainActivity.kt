package com.dalcim.smartshare.presentation.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dalcim.smartshare.R
import com.dalcim.smartshare.data.datasource.UserMemoryDataSource
import com.dalcim.smartshare.data.repository.UserMemoryRepository
import com.dalcim.smartshare.userRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter = MainPresenter(
        view = this,
        repository = userRepository
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBtnLogin.setOnClickListener {
            val login = mainEdtLogin.text.toString()
            val password = mainEdtPassword.text.toString()

            presenter.login(login, password)
        }
    }

    override fun goToCarList() {
        "foi".toast(this)
    }

    override fun showLoginMessageError(error: String) {
        error.toast(this)
    }

    private fun String.toast(context: Context) {
        Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
    }
}