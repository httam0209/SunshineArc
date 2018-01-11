package com.brian.sunshinearc.api;

import com.brian.sunshinearc.entities.WeatherEntry;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Brian
 * @date: 08/01/2018.
 */
public interface SunshineApiService {

    @GET("/weather")
    Call<List<WeatherEntry>> getWeathers(@Query("q") final String name);

}
