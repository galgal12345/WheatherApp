package gini.gilalmuly.wheatherapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import gini.gilalmuly.wheatherapp.data.db.entities.WeatherData
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weatherData: WeatherData)

    @Query("SELECT * FROM weather_data")
    fun getWeather(): Flow<WeatherData>

}