package com.dalcim.smartshare.presentation.vehicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dalcim.smartshare.R
import com.dalcim.smartshare.domain.model.Vehicle
import com.dalcim.smartshare.vehicleRepository

class VehiclesActivity : AppCompatActivity(), VehiclesContract.View {

    val presenter = VehiclesPresenter(this, vehicleRepository )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicles)


    }

    override fun showVehicles(vehicles: List<Vehicle>) {

    }

    override fun goToDetails(vehicle: Vehicle) {

    }
}