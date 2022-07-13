package gini.gilalmuly.wheatherapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gini.gilalmuly.wheatherapp.data.networking.WeatherApiService
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideWeatherService(): WeatherApiService {
        return WeatherApiService.create()
    }
}