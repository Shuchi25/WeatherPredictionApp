package com.example.weatherpredictionapp.presenter;

import com.example.weatherpredictionapp.activity.SplashActivity;
import com.example.weatherpredictionapp.data.ApiCall;
import com.example.weatherpredictionapp.data.pojo.Weather;
import com.example.weatherpredictionapp.network.RetrofitClientInstance;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class SplashPresenter implements SplashPresenterContract {

    private SplashActivity view;

    private CompositeDisposable compositeDisposable;

    public SplashPresenter() {
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void setView(SplashActivity view) {
        this.view = view;
    }


    @Override
    public void fetchData() {
        view.showLoader();

        ApiCall apiCalls = RetrofitClientInstance.getRetrofitInstance().create(ApiCall.class);

        Disposable disposable = apiCalls.fetchWeather()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Weather>() {
                    @Override
                    public void onNext(Weather weather) {
                        if (view != null) {
                            view.dataFetched(weather, false);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (view != null) {
                            view.showError();
                            view.dataFetched(null, true);
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });

        compositeDisposable.add(disposable);

    }

    @Override
    public CompositeDisposable getDisposable() {
        return compositeDisposable;
    }
}
