package com.example.dilearning

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    val engine = Engine()

    fun on() {
        engine.startEngine()
        Log.e("2323", "car is on")
    }
}