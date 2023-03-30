package com.example.dilearning

import android.util.Log
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Inject

interface Engine {
    fun startEngine()
}