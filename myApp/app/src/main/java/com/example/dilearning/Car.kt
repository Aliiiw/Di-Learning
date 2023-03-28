package com.example.dilearning

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val engine1: Engine
    ) {

    fun on() {
        engine.startEngine()
        Log.e("2323", "car is on")
    }

    fun on1(){
        engine1.startEngine()
        Log.e("2323", "car is on1")
    }
}