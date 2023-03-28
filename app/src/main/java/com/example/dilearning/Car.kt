package com.example.dilearning

import android.util.Log

class Car(private val engine: Engine) {

    fun on() {
        engine.startEngine()
        Log.e("2323", "car is on")
    }
}