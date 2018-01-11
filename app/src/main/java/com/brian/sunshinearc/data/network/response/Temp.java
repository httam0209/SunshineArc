
package com.brian.sunshinearc.entities;

import com.google.gson.annotations.SerializedName;

public class Temp {

    @SerializedName("day")
    public Double day;
    @SerializedName("min")
    public Double min;
    @SerializedName("max")
    public Double max;
    @SerializedName("night")
    public Double night;
    @SerializedName("eve")
    public Double eve;
    @SerializedName("morn")
    public Double morn;


}
