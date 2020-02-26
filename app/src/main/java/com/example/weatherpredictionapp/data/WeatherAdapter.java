package com.example.weatherpredictionapp.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherpredictionapp.R;
import com.example.weatherpredictionapp.data.pojo.Days;
import com.example.weatherpredictionapp.data.pojo.Weather;
import com.example.weatherpredictionapp.databinding.ItemBinding;


public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private Weather weatherData;
    private Context context;

    public WeatherAdapter(Context context, Weather weatherData) {
        this.weatherData = weatherData;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemBinding binding = ItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Days data = weatherData.getDays()[position];
        holder.bind(data);
        holder.binding.imageWeather.setImageDrawable(getDrawable(data.getTimeframes()[0].getWx_desc()));
    }

    @Override
    public int getItemCount() {
        return weatherData.getDays().length;
    }

    private Drawable getDrawable(String name) {
        if (name.contains("cloud"))
            return ContextCompat.getDrawable(context, R.drawable.clouds);
        else if (name.contains("rain"))
            return ContextCompat.getDrawable(context, R.drawable.rain);
        else if (name.contains("sunny"))
            return ContextCompat.getDrawable(context, R.drawable.sun);
        else if (name.contains("thunder"))
            return ContextCompat.getDrawable(context, R.drawable.storm);
        else if (name.contains("clear"))
            return ContextCompat.getDrawable(context, R.drawable.clear);
        else
            return ContextCompat.getDrawable(context, R.drawable.clear);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemBinding binding;

        ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        void bind(Days item) {
            binding.setData(item);
            binding.executePendingBindings();
        }
    }
}

