package com.example.dilearning

import android.util.Log

//constructor dependency injection
class Car(private val engine1: Engine1) {

    fun on() {
        engine1.startEngine()
        Log.e("2323", "car is on")
    }
}