package com.dalcim.smartshare.data.repository

import com.dalcim.smartshare.data.datasource.UserDataSource
import com.dalcim.smartshare.domain.model.User

class UserMemoryRepository(
    private val userDataSource: UserDataSource
) : UserRepository {

    override fun login(login: String, password: String): User? {
        val userId: Long = userDataSource.getUserId(login, password) ?: return null

        return userDataSource.getUser(userId)
    }
}