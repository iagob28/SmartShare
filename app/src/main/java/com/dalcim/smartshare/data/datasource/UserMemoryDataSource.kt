package com.dalcim.smartshare.data.datasource

import com.dalcim.smartshare.domain.model.User

class UserMemoryDataSource : UserDataSource {

    override fun getUserId(login: String, password: String): Long? {
        if (password != "123456") {
            return null
        }

        return when (login) {
            "iago@gmail" -> 1
            "wiliam@gmail" -> 2
            "mari@gmail" -> 3
            "pedro@gmail" -> 4
            else -> null
        }

    }

    override fun getUser(id: Long): User {
        return when (id) {
            1L -> User(
                id = id,
                name = "Iago Bortolon",
                cpf = "123.456.789-10",
                active = true
            )

            2L -> User(
                id = id,
                name = "Wiliam Trancoso",
                cpf = "123.456.789-11",
                active = true
            )

            3L -> User(
                id = id,
                name = "Mari Carvalho",
                cpf = "123.456.789-12",
                active = true
            )

            4L -> User(
                id = id,
                name = "Pedro Dal cim",
                cpf = "123.456.789-13",
                active = false
            )

            else -> throw IllegalArgumentException("invalid id")
        }
    }
}