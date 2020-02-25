package com.example.weatherpredictionapp.presenter;

import com.example.weatherpredictionapp.activity.SplashActivity;

import io.reactivex.disposables.CompositeDisposable;

public interface SplashPresenterContract {
    void setView(SplashActivity view);

    void fetchData();

    CompositeDisposable getDisposable();
}
