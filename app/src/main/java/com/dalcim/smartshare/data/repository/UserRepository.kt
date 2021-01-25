package com.dalcim.smartshare.data.repository

import com.dalcim.smartshare.domain.model.User

interface UserRepository {
    fun login(login: String, password: String): User?
}