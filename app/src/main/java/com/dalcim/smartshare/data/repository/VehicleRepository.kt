package com.dalcim.smartshare.data.repository

import com.dalcim.smartshare.domain.model.Vehicle

interface VehicleRepository {
    fun loadVehicles(userId: Long): List<Vehicle>
}