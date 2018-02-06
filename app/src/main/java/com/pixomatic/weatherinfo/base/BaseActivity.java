package com.pixomatic.weatherinfo.base;

import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pixomatic.weatherinfo.managers.WeatherManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mno on 2/5/18.
 */

public class BaseActivity extends AppCompatActivity {

    public Gson gson = new GsonBuilder().setLenient().create();
    public String BASE_URL = "https://api.weatherbit.io/v2.0/";
    private WeatherManager mWeatherManager;

    public Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    public WeatherManager getWeatherManager() {
        if (mWeatherManager == null) {
            mWeatherManager = new WeatherManager(this);
        }
        return mWeatherManager;
    }


}
