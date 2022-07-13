package gini.gilalmuly.wheatherapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import gini.gilalmuly.wheatherapp.data.db.entities.WeatherData

@Database(entities = [WeatherData::class], version = 1, exportSchema = false)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun weatherDao(): WeatherDao

    companion object {
        const val DB_NAME = "WeatherDatabase.db"

        @Volatile
        private var instance: WeatherDatabase? = null

        fun getInstance(context: Context): WeatherDatabase{
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): WeatherDatabase{
            return Room.databaseBuilder(context,WeatherDatabase::class.java,WeatherDatabase.DB_NAME).build()
        }
    }


}