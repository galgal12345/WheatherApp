package gini.gilalmuly.wheatherapp.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import gini.gilalmuly.wheatherapp.data.db.entities.WeatherData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class FirstFragmentViewModel@Inject constructor() : ViewModel() {

    val weatherUsingFlow : Flow<WeatherData> = flow {

    }
}