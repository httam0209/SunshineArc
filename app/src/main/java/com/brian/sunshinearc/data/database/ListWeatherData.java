
package com.brian.sunshinearc.data.database;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List {

    @SerializedName("dt")
    public Integer dt;
    @SerializedName("temp")
    public Temp temp;
    @SerializedName("pressure")
    public Double pressure;
    @SerializedName("humidity")
    public Double humidity;
    @SerializedName("weather")
    public java.util.List<Weather> weather = null;
    @SerializedName("speed")
    public Double speed;
    @SerializedName("deg")
    public Integer deg;
    @SerializedName("clouds")
    public Integer clouds;

}
