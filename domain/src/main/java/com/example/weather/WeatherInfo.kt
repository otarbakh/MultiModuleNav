package com.plcoding.weatherapp.domain.weather

import com.example.domain.weather.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
