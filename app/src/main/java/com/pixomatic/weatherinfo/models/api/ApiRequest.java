package com.pixomatic.weatherinfo.models.api;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mno on 2/6/18.
 */

public interface ApiRequest {

    @GET("current")
    Call<JsonElement> getWeatherResponse(@Query("city") String city, @Query("key") String keyId);
}
