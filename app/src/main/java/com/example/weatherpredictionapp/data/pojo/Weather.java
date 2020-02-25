package com.example.weatherpredictionapp.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Weather implements Parcelable {
    public static final Creator<Weather> CREATOR = new Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };
    private Days[] Days;

    protected Weather(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }

}
