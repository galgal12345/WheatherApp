package gini.gilalmuly.wheatherapp.repository

import gini.gilalmuly.wheatherapp.data.db.WeatherDao
import gini.gilalmuly.wheatherapp.data.db.entities.WeatherData
import gini.gilalmuly.wheatherapp.data.networking.WeatherApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepository @Inject constructor(
    private val service: WeatherApiService,
    private val weatherDao: WeatherDao

) {

    val weatherFlow: Flow<WeatherData>
        get() = weatherDao.getWeather().conflate()
}