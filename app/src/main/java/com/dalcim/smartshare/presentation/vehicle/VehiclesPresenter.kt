package com.dalcim.smartshare.presentation.vehicle

import com.dalcim.smartshare.data.repository.VehicleRepository
import com.dalcim.smartshare.domain.model.Vehicle

class VehiclesPresenter(
    private val view: VehiclesContract.View,
    private val vehicleRepository: VehicleRepository
) : VehiclesContract.Presenter {

    override fun loadVehicles(userId: Long) {
        val vehicles = vehicleRepository.loadVehicles(userId)
        view.showVehicles(vehicles)
    }

    override fun selected(vehicle: Vehicle) {
        view.goToDetails(vehicle)
    }

}