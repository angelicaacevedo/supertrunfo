package com.wcc.supertrunfo.data

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Vehicle

class SupertrunfoDatabase {
    fun getAllVehicles(): List<Vehicle>{
        val vehicleOne = Vehicle (
                100,
                5,
                120,
                120,
                2,
                "sedã",
                "car",
                5,
        )
         val vehicleTwo = Vehicle(
                 50,
                 2,
                 60,
                 10,
                 0,
                 "regular",
                 "bicke",
                 7,
         )

        val vehicleTheree = Vehicle(
                170,
                2,
                40,
                70,
                0,
                "adventure",
                "motorcycle",
                6,
        )

        val vehicleFour = Vehicle(
                130,
                4,
                170,
                110,
                2,
                "hatch",
                "car",
                5,

        )

        val vehicleFive = Vehicle(
                30,
                1,
                240,
                13,
                0,
                "regular",
                "bike",
                4,
        )

        return listOf(vehicleOne, vehicleTwo, vehicleTheree, vehicleFour, vehicleFive)
    }

    fun getAllDrivers(): List<Driver>{

        val driverOne = Driver(
                40,
                60,
                10,
                2,
                10,
                0,
                3,
                4,
        )

        val driverTwo = Driver(
                90,
                10,
                30,
                30,
                0,
                0,
                2,
                7,
        )

        val driverThree =Driver(
                50,
                30,
                80,
                3,
                7,
                15,
                6,
                2,
        )

        return listOf(driverOne, driverTwo, driverThree)
    }
}