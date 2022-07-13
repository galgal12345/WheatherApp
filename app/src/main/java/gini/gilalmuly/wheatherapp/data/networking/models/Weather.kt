package gini.gilalmuly.wheatherapp.data.networking.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("data")
    @Expose
    val data: WeatherData,
    @SerializedName("message")
    @Expose
    val message: String
)
