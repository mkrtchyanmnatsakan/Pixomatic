package com.pixomatic.weatherinfo.managers;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.pixomatic.weatherinfo.base.BaseActivity;
import com.pixomatic.weatherinfo.listeners.NetworkRequestListener;
import com.pixomatic.weatherinfo.models.api.ApiRequest;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by mno on 2/6/18.
 */

public class WeatherManager {

    private BaseActivity mBaseActivity;

    public WeatherManager(BaseActivity baseActivity) {
        mBaseActivity = baseActivity;
    }

    public void getWeatherResponse(final NetworkRequestListener listener, String id,String appId) {

        ApiRequest apiRequest = mBaseActivity.retrofit.create(ApiRequest.class);
        Call<JsonElement> call = apiRequest.getWeatherResponse(id,appId);
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, retrofit2.Response<JsonElement> response) {

                if ( response.body() != null && response.body().getAsJsonObject()!= null) {
                    Log.e("onSuccess = " , new Gson().toJson(response.body()));
                    if(response.body().getAsJsonObject().get("data")!= null )


                    listener.onSuccess(new Gson().toJson(response.body()));
                } else {
                    Log.e("Error = " , new Gson().toJson(response.body()));
                    listener.onError("Error");
                }
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                if (t != null) {
                    Log.e("onFailure", t.getMessage());
                    listener.onError("Error: " + t.getMessage());
                }
            }
        });
    }

}
