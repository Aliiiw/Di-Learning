package com.example.dilearning

import android.util.Log

class Car2 {

    private val engine = Engine2()

    fun on() {
        engine.startEngine()
        Log.e("2323", "car is on")
    }
}