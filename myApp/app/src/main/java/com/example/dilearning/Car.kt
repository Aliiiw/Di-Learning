package com.example.dilearning

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(
    @TestEL private val engine: Engine
    ) {

    fun on() {
        engine.startEngine()
        Log.e("2323", "car is on")
    }
}