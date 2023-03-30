package com.example.dilearning

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object EngineModule {

    @Provides
    @Named("TestEngine")
    fun provideTestEngine(): Engine {
        return TestEngine()
    }

    @Provides
    @Named("ElectricEngine")
    fun provideElectricEngine(): Engine {
        return ElectricEngine()
    }
}