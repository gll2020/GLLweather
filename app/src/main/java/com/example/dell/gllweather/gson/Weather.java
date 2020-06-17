package com.example.dell.gllweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 2020/6/18.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
