package com.dalcim.smartshare.domain.model

data class User(
    val id: Long,
    val name: String,
    val cpf: String,
    val active: Boolean
)
