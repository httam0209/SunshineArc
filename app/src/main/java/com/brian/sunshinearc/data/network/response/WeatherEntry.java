
package com.brian.sunshinearc.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherEntry {

    @SerializedName("dt")
    public Integer dt;
    @SerializedName("temp")
    public Temp temp;
    @SerializedName("pressure")
    public Double pressure;
    @SerializedName("humidity")
    public Double humidity;
    @SerializedName("weather")
    public List<Weather> weather = null;
    @SerializedName("speed")
    public Double speed;
    @SerializedName("deg")
    public Integer deg;
    @SerializedName("clouds")
    public Integer clouds;

}
