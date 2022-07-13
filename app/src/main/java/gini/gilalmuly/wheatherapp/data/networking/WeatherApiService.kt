package gini.gilalmuly.wheatherapp.data.networking

import gini.gilalmuly.wheatherapp.BuildConfig
import gini.gilalmuly.wheatherapp.data.networking.models.Weather
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("weather/latest/by-lat-lng")
    suspend fun searchWeather(
        @Query("lat") lat: Long,
        @Query("lng") lng: Long,
        @Query("x-api-key")
        apikey: String = BuildConfig.WHETHER_API_KEY
    ): Weather

    companion object {
        private const val BASE_URL = BuildConfig.WHETHER_API_URL

        fun create(): WeatherApiService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherApiService::class.java)
        }
    }
}