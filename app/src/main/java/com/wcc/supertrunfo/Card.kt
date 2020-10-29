package com.wcc.supertrunfo

class Card (
        val vehicle: Vehicle,
        val drivers: Driver,
        val player: Player,
) {
    val label: String = "Card ${player.name}"
    val maxVelocity =setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = setPassengers()
}

private fun setAccelerationTime(): Int {
    return vehicle.accelerationTime * (1 + drivers.carChampionships)
}

private fun setMaxVelocity(): Int {
    TODO("Not yet implemented")
}

private fun setPassengers(): Int {
    return vehicle.passengers * (1 + drivers.defensiveDriving)
}