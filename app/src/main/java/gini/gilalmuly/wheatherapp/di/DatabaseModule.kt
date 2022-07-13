package gini.gilalmuly.wheatherapp.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gini.gilalmuly.wheatherapp.data.db.WeatherDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideWeatherDao(db: WeatherDatabase) = db.weatherDao()

    @Singleton
    @Provides
    fun provideWeatherDatabase(app:Application) = WeatherDatabase.getInstance(app)
}