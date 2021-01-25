package com.dalcim.smartshare.data.datasource

import com.dalcim.smartshare.domain.model.Vehicle

interface VehicleDataSource {
    fun loadVehicles(userId: Long): List<Vehicle>
}