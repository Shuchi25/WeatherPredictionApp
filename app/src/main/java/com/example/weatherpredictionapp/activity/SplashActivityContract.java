package com.example.weatherpredictionapp.activity;

import com.example.weatherpredictionapp.data.pojo.Weather;

public interface SplashActivityContract {

    void showError();

    void showLoader();

    void dataFetched(Weather data, Boolean isErrorFound);
}
