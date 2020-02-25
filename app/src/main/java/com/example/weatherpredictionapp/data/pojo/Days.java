package com.example.weatherpredictionapp.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Days implements Parcelable {
    public static final Creator<Days> CREATOR = new Creator<Days>() {
        @Override
        public Days createFromParcel(Parcel in) {
            return new Days(in);
        }

        @Override
        public Days[] newArray(int size) {
            return new Days[size];
        }
    };
    private String date;
    private String windgst_max_kts;
    private String sunset_time;
    private String snow_total_in;
    private String rain_total_mm;
    private String slp_max_mb;
    private String rain_total_in;
    private String windspd_max_kts;
    private String temp_max_f;
    private String snow_total_mm;
    private String windspd_max_mph;
    private String windgst_max_ms;
    private String sunrise_time;
    private String windgst_max_mph;
    private String temp_min_f;
    private String precip_total_mm;
    private String slp_min_mb;
    private String prob_precip_pct;
    private String temp_min_c;
    private String windspd_max_ms;
    private String moonset_time;
    private String humid_max_pct;
    private String precip_total_in;
    private String windspd_max_kmh;
    private String slp_min_in;
    private Timeframes[] Timeframes;
    private String humid_min_pct;
    private String moonrise_time;
    private String temp_max_c;
    private String slp_max_in;
    private String windgst_max_kmh;

    protected Days(Parcel in) {
        date = in.readString();
        windgst_max_kts = in.readString();
        sunset_time = in.readString();
        snow_total_in = in.readString();
        rain_total_mm = in.readString();
        slp_max_mb = in.readString();
        rain_total_in = in.readString();
        windspd_max_kts = in.readString();
        temp_max_f = in.readString();
        snow_total_mm = in.readString();
        windspd_max_mph = in.readString();
        windgst_max_ms = in.readString();
        sunrise_time = in.readString();
        windgst_max_mph = in.readString();
        temp_min_f = in.readString();
        precip_total_mm = in.readString();
        slp_min_mb = in.readString();
        prob_precip_pct = in.readString();
        temp_min_c = in.readString();
        windspd_max_ms = in.readString();
        moonset_time = in.readString();
        humid_max_pct = in.readString();
        precip_total_in = in.readString();
        windspd_max_kmh = in.readString();
        slp_min_in = in.readString();
        humid_min_pct = in.readString();
        moonrise_time = in.readString();
        temp_max_c = in.readString();
        slp_max_in = in.readString();
        windgst_max_kmh = in.readString();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWindgst_max_kts() {
        return windgst_max_kts;
    }

    public void setWindgst_max_kts(String windgst_max_kts) {
        this.windgst_max_kts = windgst_max_kts;
    }

    public String getSunset_time() {
        return sunset_time;
    }

    public void setSunset_time(String sunset_time) {
        this.sunset_time = sunset_time;
    }

    public String getSnow_total_in() {
        return snow_total_in;
    }

    public void setSnow_total_in(String snow_total_in) {
        this.snow_total_in = snow_total_in;
    }

    public String getRain_total_mm() {
        return rain_total_mm;
    }

    public void setRain_total_mm(String rain_total_mm) {
        this.rain_total_mm = rain_total_mm;
    }

    public String getSlp_max_mb() {
        return slp_max_mb;
    }

    public void setSlp_max_mb(String slp_max_mb) {
        this.slp_max_mb = slp_max_mb;
    }

    public String getRain_total_in() {
        return rain_total_in;
    }

    public void setRain_total_in(String rain_total_in) {
        this.rain_total_in = rain_total_in;
    }

    public String getWindspd_max_kts() {
        return windspd_max_kts;
    }

    public void setWindspd_max_kts(String windspd_max_kts) {
        this.windspd_max_kts = windspd_max_kts;
    }

    public String getTemp_max_f() {
        return temp_max_f;
    }

    public void setTemp_max_f(String temp_max_f) {
        this.temp_max_f = temp_max_f;
    }

    public String getSnow_total_mm() {
        return snow_total_mm;
    }

    public void setSnow_total_mm(String snow_total_mm) {
        this.snow_total_mm = snow_total_mm;
    }

    public String getWindspd_max_mph() {
        return windspd_max_mph;
    }

    public void setWindspd_max_mph(String windspd_max_mph) {
        this.windspd_max_mph = windspd_max_mph;
    }

    public String getWindgst_max_ms() {
        return windgst_max_ms;
    }

    public void setWindgst_max_ms(String windgst_max_ms) {
        this.windgst_max_ms = windgst_max_ms;
    }

    public String getSunrise_time() {
        return sunrise_time;
    }

    public void setSunrise_time(String sunrise_time) {
        this.sunrise_time = sunrise_time;
    }

    public String getWindgst_max_mph() {
        return windgst_max_mph;
    }

    public void setWindgst_max_mph(String windgst_max_mph) {
        this.windgst_max_mph = windgst_max_mph;
    }

    public String getTemp_min_f() {
        return temp_min_f;
    }

    public void setTemp_min_f(String temp_min_f) {
        this.temp_min_f = temp_min_f;
    }

    public String getPrecip_total_mm() {
        return precip_total_mm;
    }

    public void setPrecip_total_mm(String precip_total_mm) {
        this.precip_total_mm = precip_total_mm;
    }

    public String getSlp_min_mb() {
        return slp_min_mb;
    }

    public void setSlp_min_mb(String slp_min_mb) {
        this.slp_min_mb = slp_min_mb;
    }

    public String getProb_precip_pct() {
        return prob_precip_pct;
    }

    public void setProb_precip_pct(String prob_precip_pct) {
        this.prob_precip_pct = prob_precip_pct;
    }

    public String getTemp_min_c() {
        return temp_min_c;
    }

    public void setTemp_min_c(String temp_min_c) {
        this.temp_min_c = temp_min_c;
    }

    public String getWindspd_max_ms() {
        return windspd_max_ms;
    }

    public void setWindspd_max_ms(String windspd_max_ms) {
        this.windspd_max_ms = windspd_max_ms;
    }

    public String getMoonset_time() {
        return moonset_time;
    }

    public void setMoonset_time(String moonset_time) {
        this.moonset_time = moonset_time;
    }

    public String getHumid_max_pct() {
        return humid_max_pct;
    }

    public void setHumid_max_pct(String humid_max_pct) {
        this.humid_max_pct = humid_max_pct;
    }

    public String getPrecip_total_in() {
        return precip_total_in;
    }

    public void setPrecip_total_in(String precip_total_in) {
        this.precip_total_in = precip_total_in;
    }

    public String getWindspd_max_kmh() {
        return windspd_max_kmh;
    }

    public void setWindspd_max_kmh(String windspd_max_kmh) {
        this.windspd_max_kmh = windspd_max_kmh;
    }

    public String getSlp_min_in() {
        return slp_min_in;
    }

    public void setSlp_min_in(String slp_min_in) {
        this.slp_min_in = slp_min_in;
    }

    public Timeframes[] getTimeframes() {
        return Timeframes;
    }

    public void setTimeframes(Timeframes[] Timeframes) {
        this.Timeframes = Timeframes;
    }

    public String getHumid_min_pct() {
        return humid_min_pct;
    }

    public void setHumid_min_pct(String humid_min_pct) {
        this.humid_min_pct = humid_min_pct;
    }

    public String getMoonrise_time() {
        return moonrise_time;
    }

    public void setMoonrise_time(String moonrise_time) {
        this.moonrise_time = moonrise_time;
    }

    public String getTemp_max_c() {
        return temp_max_c;
    }

    public void setTemp_max_c(String temp_max_c) {
        this.temp_max_c = temp_max_c;
    }

    public String getSlp_max_in() {
        return slp_max_in;
    }

    public void setSlp_max_in(String slp_max_in) {
        this.slp_max_in = slp_max_in;
    }

    public String getWindgst_max_kmh() {
        return windgst_max_kmh;
    }

    public void setWindgst_max_kmh(String windgst_max_kmh) {
        this.windgst_max_kmh = windgst_max_kmh;
    }

    @Override
    public String toString() {
        return "ClassPojo [date = " + date + ", windgst_max_kts = " + windgst_max_kts + ", sunset_time = " + sunset_time + ", snow_total_in = " + snow_total_in + ", rain_total_mm = " + rain_total_mm + ", slp_max_mb = " + slp_max_mb + ", rain_total_in = " + rain_total_in + ", windspd_max_kts = " + windspd_max_kts + ", temp_max_f = " + temp_max_f + ", snow_total_mm = " + snow_total_mm + ", windspd_max_mph = " + windspd_max_mph + ", windgst_max_ms = " + windgst_max_ms + ", sunrise_time = " + sunrise_time + ", windgst_max_mph = " + windgst_max_mph + ", temp_min_f = " + temp_min_f + ", precip_total_mm = " + precip_total_mm + ", slp_min_mb = " + slp_min_mb + ", prob_precip_pct = " + prob_precip_pct + ", temp_min_c = " + temp_min_c + ", windspd_max_ms = " + windspd_max_ms + ", moonset_time = " + moonset_time + ", humid_max_pct = " + humid_max_pct + ", precip_total_in = " + precip_total_in + ", windspd_max_kmh = " + windspd_max_kmh + ", slp_min_in = " + slp_min_in + ", Timeframes = " + Timeframes + ", humid_min_pct = " + humid_min_pct + ", moonrise_time = " + moonrise_time + ", temp_max_c = " + temp_max_c + ", slp_max_in = " + slp_max_in + ", windgst_max_kmh = " + windgst_max_kmh + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(date);
        parcel.writeString(windgst_max_kts);
        parcel.writeString(sunset_time);
        parcel.writeString(snow_total_in);
        parcel.writeString(rain_total_mm);
        parcel.writeString(slp_max_mb);
        parcel.writeString(rain_total_in);
        parcel.writeString(windspd_max_kts);
        parcel.writeString(temp_max_f);
        parcel.writeString(snow_total_mm);
        parcel.writeString(windspd_max_mph);
        parcel.writeString(windgst_max_ms);
        parcel.writeString(sunrise_time);
        parcel.writeString(windgst_max_mph);
        parcel.writeString(temp_min_f);
        parcel.writeString(precip_total_mm);
        parcel.writeString(slp_min_mb);
        parcel.writeString(prob_precip_pct);
        parcel.writeString(temp_min_c);
        parcel.writeString(windspd_max_ms);
        parcel.writeString(moonset_time);
        parcel.writeString(humid_max_pct);
        parcel.writeString(precip_total_in);
        parcel.writeString(windspd_max_kmh);
        parcel.writeString(slp_min_in);
        parcel.writeString(humid_min_pct);
        parcel.writeString(moonrise_time);
        parcel.writeString(temp_max_c);
        parcel.writeString(slp_max_in);
        parcel.writeString(windgst_max_kmh);
    }
}
