package com.example.weatherpredictionapp.data;

import com.example.weatherpredictionapp.data.pojo.Weather;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiCall {

    @GET("api/forecast/12.9716,77.5946?app_id=28cbf8fe&app_key=8dcba3ef63ef34d40ae58b30f60c2177")
    Observable<Weather> fetchWeather();
}
