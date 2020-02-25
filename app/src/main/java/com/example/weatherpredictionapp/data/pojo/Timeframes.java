package com.example.weatherpredictionapp.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Timeframes implements Parcelable {
    public static final Creator<Timeframes> CREATOR = new Creator<Timeframes>() {
        @Override
        public Timeframes createFromParcel(Parcel in) {
            return new Timeframes(in);
        }

        @Override
        public Timeframes[] newArray(int size) {
            return new Timeframes[size];
        }
    };
    private String date;
    private String windspd_mph;
    private String feelslike_c;
    private String feelslike_f;
    private String vis_mi;
    private String cloud_low_pct;
    private String temp_c;
    private String slp_in;
    private String temp_f;
    private String windspd_kts;
    private String windgst_kts;
    private String snow_in;
    private String winddir_compass;
    private String winddir_deg;
    private String snow_accum_in;
    private String dewpoint_f;
    private String wx_desc;
    private String windgst_mph;
    private String snow_accum_cm;
    private String utcdate;
    private String wx_icon;
    private String windspd_kmh;
    private String prob_precip_pct;
    private String cloud_mid_pct;
    private String utctime;
    private String humid_pct;
    private String dewpoint_c;
    private String snow_mm;
    private String precip_in;
    private String rain_mm;
    private String precip_mm;
    private String cloud_high_pct;
    private String cloudtotal_pct;
    private String windgst_ms;
    private String rain_in;
    private String vis_km;
    private String windspd_ms;
    private String time;
    private String windgst_kmh;
    private String slp_mb;
    private String wx_code;

    protected Timeframes(Parcel in) {
        date = in.readString();
        windspd_mph = in.readString();
        feelslike_c = in.readString();
        feelslike_f = in.readString();
        vis_mi = in.readString();
        cloud_low_pct = in.readString();
        temp_c = in.readString();
        slp_in = in.readString();
        temp_f = in.readString();
        windspd_kts = in.readString();
        windgst_kts = in.readString();
        snow_in = in.readString();
        winddir_compass = in.readString();
        winddir_deg = in.readString();
        snow_accum_in = in.readString();
        dewpoint_f = in.readString();
        wx_desc = in.readString();
        windgst_mph = in.readString();
        snow_accum_cm = in.readString();
        utcdate = in.readString();
        wx_icon = in.readString();
        windspd_kmh = in.readString();
        prob_precip_pct = in.readString();
        cloud_mid_pct = in.readString();
        utctime = in.readString();
        humid_pct = in.readString();
        dewpoint_c = in.readString();
        snow_mm = in.readString();
        precip_in = in.readString();
        rain_mm = in.readString();
        precip_mm = in.readString();
        cloud_high_pct = in.readString();
        cloudtotal_pct = in.readString();
        windgst_ms = in.readString();
        rain_in = in.readString();
        vis_km = in.readString();
        windspd_ms = in.readString();
        time = in.readString();
        windgst_kmh = in.readString();
        slp_mb = in.readString();
        wx_code = in.readString();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWindspd_mph() {
        return windspd_mph;
    }

    public void setWindspd_mph(String windspd_mph) {
        this.windspd_mph = windspd_mph;
    }

    public String getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public String getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public String getVis_mi() {
        return vis_mi;
    }

    public void setVis_mi(String vis_mi) {
        this.vis_mi = vis_mi;
    }

    public String getCloud_low_pct() {
        return cloud_low_pct;
    }

    public void setCloud_low_pct(String cloud_low_pct) {
        this.cloud_low_pct = cloud_low_pct;
    }

    public String getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(String temp_c) {
        this.temp_c = temp_c;
    }

    public String getSlp_in() {
        return slp_in;
    }

    public void setSlp_in(String slp_in) {
        this.slp_in = slp_in;
    }

    public String getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(String temp_f) {
        this.temp_f = temp_f;
    }

    public String getWindspd_kts() {
        return windspd_kts;
    }

    public void setWindspd_kts(String windspd_kts) {
        this.windspd_kts = windspd_kts;
    }

    public String getWindgst_kts() {
        return windgst_kts;
    }

    public void setWindgst_kts(String windgst_kts) {
        this.windgst_kts = windgst_kts;
    }

    public String getSnow_in() {
        return snow_in;
    }

    public void setSnow_in(String snow_in) {
        this.snow_in = snow_in;
    }

    public String getWinddir_compass() {
        return winddir_compass;
    }

    public void setWinddir_compass(String winddir_compass) {
        this.winddir_compass = winddir_compass;
    }

    public String getWinddir_deg() {
        return winddir_deg;
    }

    public void setWinddir_deg(String winddir_deg) {
        this.winddir_deg = winddir_deg;
    }

    public String getSnow_accum_in() {
        return snow_accum_in;
    }

    public void setSnow_accum_in(String snow_accum_in) {
        this.snow_accum_in = snow_accum_in;
    }

    public String getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(String dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public String getWx_desc() {
        return wx_desc;
    }

    public void setWx_desc(String wx_desc) {
        this.wx_desc = wx_desc;
    }

    public String getWindgst_mph() {
        return windgst_mph;
    }

    public void setWindgst_mph(String windgst_mph) {
        this.windgst_mph = windgst_mph;
    }

    public String getSnow_accum_cm() {
        return snow_accum_cm;
    }

    public void setSnow_accum_cm(String snow_accum_cm) {
        this.snow_accum_cm = snow_accum_cm;
    }

    public String getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(String utcdate) {
        this.utcdate = utcdate;
    }

    public String getWx_icon() {
        return wx_icon;
    }

    public void setWx_icon(String wx_icon) {
        this.wx_icon = wx_icon;
    }

    public String getWindspd_kmh() {
        return windspd_kmh;
    }

    public void setWindspd_kmh(String windspd_kmh) {
        this.windspd_kmh = windspd_kmh;
    }

    public String getProb_precip_pct() {
        return prob_precip_pct;
    }

    public void setProb_precip_pct(String prob_precip_pct) {
        this.prob_precip_pct = prob_precip_pct;
    }

    public String getCloud_mid_pct() {
        return cloud_mid_pct;
    }

    public void setCloud_mid_pct(String cloud_mid_pct) {
        this.cloud_mid_pct = cloud_mid_pct;
    }

    public String getUtctime() {
        return utctime;
    }

    public void setUtctime(String utctime) {
        this.utctime = utctime;
    }

    public String getHumid_pct() {
        return humid_pct;
    }

    public void setHumid_pct(String humid_pct) {
        this.humid_pct = humid_pct;
    }

    public String getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(String dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public String getSnow_mm() {
        return snow_mm;
    }

    public void setSnow_mm(String snow_mm) {
        this.snow_mm = snow_mm;
    }

    public String getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(String precip_in) {
        this.precip_in = precip_in;
    }

    public String getRain_mm() {
        return rain_mm;
    }

    public void setRain_mm(String rain_mm) {
        this.rain_mm = rain_mm;
    }

    public String getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(String precip_mm) {
        this.precip_mm = precip_mm;
    }

    public String getCloud_high_pct() {
        return cloud_high_pct;
    }

    public void setCloud_high_pct(String cloud_high_pct) {
        this.cloud_high_pct = cloud_high_pct;
    }

    public String getCloudtotal_pct() {
        return cloudtotal_pct;
    }

    public void setCloudtotal_pct(String cloudtotal_pct) {
        this.cloudtotal_pct = cloudtotal_pct;
    }

    public String getWindgst_ms() {
        return windgst_ms;
    }

    public void setWindgst_ms(String windgst_ms) {
        this.windgst_ms = windgst_ms;
    }

    public String getRain_in() {
        return rain_in;
    }

    public void setRain_in(String rain_in) {
        this.rain_in = rain_in;
    }

    public String getVis_km() {
        return vis_km;
    }

    public void setVis_km(String vis_km) {
        this.vis_km = vis_km;
    }

    public String getWindspd_ms() {
        return windspd_ms;
    }

    public void setWindspd_ms(String windspd_ms) {
        this.windspd_ms = windspd_ms;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWindgst_kmh() {
        return windgst_kmh;
    }

    public void setWindgst_kmh(String windgst_kmh) {
        this.windgst_kmh = windgst_kmh;
    }

    public String getSlp_mb() {
        return slp_mb;
    }

    public void setSlp_mb(String slp_mb) {
        this.slp_mb = slp_mb;
    }

    public String getWx_code() {
        return wx_code;
    }

    public void setWx_code(String wx_code) {
        this.wx_code = wx_code;
    }

    @Override
    public String toString() {
        return "ClassPojo [date = " + date + ", windspd_mph = " + windspd_mph + ", feelslike_c = " + feelslike_c + ", feelslike_f = " + feelslike_f + ", vis_mi = " + vis_mi + ", cloud_low_pct = " + cloud_low_pct + ", temp_c = " + temp_c + ", slp_in = " + slp_in + ", temp_f = " + temp_f + ", windspd_kts = " + windspd_kts + ", windgst_kts = " + windgst_kts + ", snow_in = " + snow_in + ", winddir_compass = " + winddir_compass + ", winddir_deg = " + winddir_deg + ", snow_accum_in = " + snow_accum_in + ", dewpoint_f = " + dewpoint_f + ", wx_desc = " + wx_desc + ", windgst_mph = " + windgst_mph + ", snow_accum_cm = " + snow_accum_cm + ", utcdate = " + utcdate + ", wx_icon = " + wx_icon + ", windspd_kmh = " + windspd_kmh + ", prob_precip_pct = " + prob_precip_pct + ", cloud_mid_pct = " + cloud_mid_pct + ", utctime = " + utctime + ", humid_pct = " + humid_pct + ", dewpoint_c = " + dewpoint_c + ", snow_mm = " + snow_mm + ", precip_in = " + precip_in + ", rain_mm = " + rain_mm + ", precip_mm = " + precip_mm + ", cloud_high_pct = " + cloud_high_pct + ", cloudtotal_pct = " + cloudtotal_pct + ", windgst_ms = " + windgst_ms + ", rain_in = " + rain_in + ", vis_km = " + vis_km + ", windspd_ms = " + windspd_ms + ", time = " + time + ", windgst_kmh = " + windgst_kmh + ", slp_mb = " + slp_mb + ", wx_code = " + wx_code + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(date);
        parcel.writeString(windspd_mph);
        parcel.writeString(feelslike_c);
        parcel.writeString(feelslike_f);
        parcel.writeString(vis_mi);
        parcel.writeString(cloud_low_pct);
        parcel.writeString(temp_c);
        parcel.writeString(slp_in);
        parcel.writeString(temp_f);
        parcel.writeString(windspd_kts);
        parcel.writeString(windgst_kts);
        parcel.writeString(snow_in);
        parcel.writeString(winddir_compass);
        parcel.writeString(winddir_deg);
        parcel.writeString(snow_accum_in);
        parcel.writeString(dewpoint_f);
        parcel.writeString(wx_desc);
        parcel.writeString(windgst_mph);
        parcel.writeString(snow_accum_cm);
        parcel.writeString(utcdate);
        parcel.writeString(wx_icon);
        parcel.writeString(windspd_kmh);
        parcel.writeString(prob_precip_pct);
        parcel.writeString(cloud_mid_pct);
        parcel.writeString(utctime);
        parcel.writeString(humid_pct);
        parcel.writeString(dewpoint_c);
        parcel.writeString(snow_mm);
        parcel.writeString(precip_in);
        parcel.writeString(rain_mm);
        parcel.writeString(precip_mm);
        parcel.writeString(cloud_high_pct);
        parcel.writeString(cloudtotal_pct);
        parcel.writeString(windgst_ms);
        parcel.writeString(rain_in);
        parcel.writeString(vis_km);
        parcel.writeString(windspd_ms);
        parcel.writeString(time);
        parcel.writeString(windgst_kmh);
        parcel.writeString(slp_mb);
        parcel.writeString(wx_code);
    }
}
