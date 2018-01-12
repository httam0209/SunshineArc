package com.brian.sunshinearc.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.brian.sunshinearc.data.SunshineRepository;
import com.brian.sunshinearc.data.network.response.WeatherEntry;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Brian
 * @date: 11/01/2018.
 */

public class ForestWeatherModel extends ViewModel {

    private final LiveData<List<WeatherEntry>> forestWeathers;
    private final MutableLiveData<String> city;

    @Inject
    public ForestWeatherModel(SunshineRepository repository) {
        this.city = new MutableLiveData<>();
        forestWeathers = repository.getForestWeather(city.getValue());
    }

    public void setCity(String city) {
        this.city.setValue(city);
    }

    public LiveData<List<WeatherEntry>> getForestWether() {
        return forestWeathers;
    }
}
