package gini.gilalmuly.wheatherapp.data.db.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.*

@Entity(tableName = "weather_data")
@Parcelize
data class WeatherData(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val lat: Int,
    val lng: Int,
    val summary: String,
    val icon: String,
    val temperature: String,
): Parcelable
