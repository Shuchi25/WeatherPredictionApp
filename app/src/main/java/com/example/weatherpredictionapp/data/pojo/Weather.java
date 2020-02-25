package com.example.weatherpredictionapp.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Weather implements Parcelable {
    private Days[] Days;

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

    private Weather(Parcel in) {
        Days = in.createTypedArray(com.example.weatherpredictionapp.data.pojo.Days.CREATOR);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(Days, i);
    }
}
