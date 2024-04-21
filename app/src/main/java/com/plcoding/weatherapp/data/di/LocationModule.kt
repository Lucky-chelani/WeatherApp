package com.plcoding.weatherapp.data.di

import com.plcoding.weatherapp.data.location.DefauktLocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.plcoding.weatherapp.domain.location.LocationTracker as LocationTracker1

@Module
@InstallIn(SingletonComponent:: class)
abstract class LocationModule{
    @Binds
    @Singleton
    abstract fun bindLocationTracker(defauktLocationTracker: DefauktLocationTracker): LocationTracker1

}