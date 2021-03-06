package com.dalcim.smartshare

import com.dalcim.smartshare.data.datasource.UserDataSource
import com.dalcim.smartshare.data.datasource.UserMemoryDataSource
import com.dalcim.smartshare.data.repository.UserMemoryRepository
import com.dalcim.smartshare.data.repository.UserRepository
import com.dalcim.smartshare.data.repository.VehicleRepository

val userDataSource: UserDataSource
    get() = UserMemoryDataSource()

val userRepository: UserRepository
    get() = UserMemoryRepository(
        userDataSource = userDataSource
    )

val vehicleRepository: VehicleRepository
    get() = TODO()