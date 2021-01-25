package com.dalcim.smartshare.presentation.vehicle

import com.dalcim.smartshare.domain.model.Vehicle

interface VehiclesContract {
    interface View {
        fun showVehicles(vehicles: List<Vehicle>)
        fun goToDetails(vehicle: Vehicle)
    }

    interface Presenter {
        fun loadVehicles(userId: Long)
        fun selected(vehicle: Vehicle)
    }
}