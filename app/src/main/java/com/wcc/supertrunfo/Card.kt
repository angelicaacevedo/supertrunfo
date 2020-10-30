package com.wcc.supertrunfo

import com.wcc.supertrunfo.Driver

class Card (
        private val vehicle: Vehicle,
        private val drivers: Driver,
) {
    val maxVelocity = initMaxVelocity()
    val accelerationTime = initAccelerationTime()
    val passengers = initPassengers()
    val xp: Unit = initXP()

    private fun initXP() {

    }


    private fun initAccelerationTime(): Int {
        return vehicle.accelerationTime
    }

    private fun initMaxVelocity(): Int {
        return when (vehicle.type) {
            "car" -> carMaxVelocity()
            "motorcycle" -> motorcycleMaxVelocity()
            else -> bikeMaxVelocity()
        }
    }

    private fun bikeMaxVelocity(): Int {
        return vehicle.maxAcceleration * drivers.boldness
    }

   private  fun motorcycleMaxVelocity(): Int {
        return 1 / vehicle.weight * vehicle.maxAcceleration
    }

    private fun carMaxVelocity(): Int {
        return if (vehicle.style == "sedã") {
            vehicle.maxAcceleration
        } else {
            vehicle.maxAcceleration + 10
        }
    }

    private fun initPassengers(): Int {
        return vehicle.passengers * (1 + drivers.defensiveDriving)
    }

    private fun setXp(): Int {
        return when (vehicle.type) {
            "car" -> drivers.carXP
            "motorcycle" -> drivers.motorcycleXp
            else -> drivers.bikeXP
        }
    }
}