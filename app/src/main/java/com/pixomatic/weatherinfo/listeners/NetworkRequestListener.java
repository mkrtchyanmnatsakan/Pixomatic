package com.pixomatic.weatherinfo.listeners;

/**
 * Created by mno on 2/6/18.
 */

public interface NetworkRequestListener {

    void onSuccess(String stringJson);

    void onError(String error);
}
