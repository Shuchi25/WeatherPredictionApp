package com.example.weatherpredictionapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.weatherpredictionapp.R;
import com.example.weatherpredictionapp.data.pojo.Weather;
import com.example.weatherpredictionapp.databinding.ActivitySplashscreenBinding;
import com.example.weatherpredictionapp.presenter.SplashPresenter;
import com.example.weatherpredictionapp.presenter.SplashPresenterContract;

public class SplashActivity extends BaseActivity implements SplashActivityContract {

    private static final String TAG = SplashActivity.class.getSimpleName();
    SplashPresenterContract presenter;
    ActivitySplashscreenBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new SplashPresenter();
        presenter.setView(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splashscreen);
        binding.setClickEvent(this);
        presenter.fetchData();
    }

    @Override
    public void showError() {
        binding.progressBar.setVisibility(View.GONE);
        binding.loadingText.setVisibility(View.GONE);
        binding.errorImage.setVisibility(View.VISIBLE);
        binding.retryButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void showLoader() {
        binding.progressBar.setVisibility(View.VISIBLE);
        binding.loadingText.setVisibility(View.VISIBLE);
        binding.errorImage.setVisibility(View.GONE);
        binding.retryButton.setVisibility(View.GONE);
    }

    @Override
    public void dataFetched(Weather data, Boolean isErrorFound) {
        if (data != null && !isErrorFound) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("data", data);
            startActivity(intent);
            finish();
        } else
            Log.v(TAG + "datafetch", "something went wrong");
    }


    public void retryButtonClick(View v) {
        presenter.fetchData();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.getDisposable().clear();
    }
}
