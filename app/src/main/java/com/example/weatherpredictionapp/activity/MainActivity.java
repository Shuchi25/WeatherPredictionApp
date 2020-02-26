package com.example.weatherpredictionapp.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherpredictionapp.R;
import com.example.weatherpredictionapp.data.WeatherAdapter;
import com.example.weatherpredictionapp.data.pojo.Weather;
import com.example.weatherpredictionapp.databinding.ActivityMainBinding;
import com.example.weatherpredictionapp.presenter.MainActivityPresenter;
import com.example.weatherpredictionapp.presenter.MainActivityPresenterContract;

public class MainActivity extends AppCompatActivity {

    private static Boolean SHEET_EXPANDED = false;
    private static int INITIAL_HEIGHT_VIEW, MARGIN_TOP;
    ActivityMainBinding binding;
    Weather weatherData;
    MainActivityPresenterContract presenter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainActivityPresenter();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter.setView(this);
        Bundle data = getIntent().getExtras();
        if (data != null) {
            weatherData = data.getParcelable("data");
        }
        if (weatherData != null && weatherData.getDays() != null) {
            binding.setData(weatherData.getDays()[0]);
        }
        WeatherAdapter adapter = new WeatherAdapter(this, weatherData);
        binding.recycler.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recycler.setLayoutManager(layoutManager);
        binding.recycler.setItemAnimator(new DefaultItemAnimator());
        binding.recycler.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerOnTouch();
        INITIAL_HEIGHT_VIEW = ((ViewGroup.MarginLayoutParams) binding.recycler.getLayoutParams()).topMargin;

    }


    void recyclerOnTouch() {

        binding.recycler.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int a = layoutManager.findLastCompletelyVisibleItemPosition();
                // Log.v("views initial", String.valueOf(INITIAL_HEIGHT_VIEW));
                // Log.v("views initial", String.valueOf(((ViewGroup.MarginLayoutParams) binding.recycler.getLayoutParams()).topMargin));
                MARGIN_TOP = ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).topMargin;

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    binding.recycler.startAnimation(slideUpAnimation(binding.recycler));
                    if (layoutManager.findLastCompletelyVisibleItemPosition() == 5)
                        SHEET_EXPANDED = true;
                    else if (INITIAL_HEIGHT_VIEW >= ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).topMargin)
                        SHEET_EXPANDED = false;
                }
                return true;
            }
        });
    }


    Animation slideUpAnimation(final RecyclerView v) {
        final Animation animation = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {


                ViewGroup.MarginLayoutParams marginLayoutParams =
                        (ViewGroup.MarginLayoutParams) binding.recycler.getLayoutParams();

                if (layoutManager.findLastCompletelyVisibleItemPosition() < 5 && !SHEET_EXPANDED) {
                    marginLayoutParams.setMargins(0, (int) (MARGIN_TOP - 30), 0, 0);
                    v.setLayoutParams(marginLayoutParams);
                    MARGIN_TOP = MARGIN_TOP - 30;
                } else if (INITIAL_HEIGHT_VIEW >= MARGIN_TOP && SHEET_EXPANDED) {
                    if (MARGIN_TOP + 30 > INITIAL_HEIGHT_VIEW) {
                        marginLayoutParams.setMargins(0, (int) (INITIAL_HEIGHT_VIEW), 0, 0);
                        MARGIN_TOP = INITIAL_HEIGHT_VIEW;
                        this.cancel();
                    } else {
                        marginLayoutParams.setMargins(0, (int) (MARGIN_TOP + 30), 0, 0);
                        MARGIN_TOP = MARGIN_TOP + 30;
                    }
                    v.setLayoutParams(marginLayoutParams);
                }
            }
        };
        animation.setDuration(300);
        animation.setInterpolator(new AccelerateInterpolator());

        return animation;
    }

}
