package com.dalcim.smartshare.data.datasource

import com.dalcim.smartshare.domain.model.User

interface UserDataSource {
    fun getUserId(login: String, password: String): Long?
    fun getUser(id: Long): User
}