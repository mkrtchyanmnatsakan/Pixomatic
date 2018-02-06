package com.pixomatic.weatherinfo;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.gson.Gson;
import com.pixomatic.weatherinfo.adapters.InfoWeatherAdapter;
import com.pixomatic.weatherinfo.base.BaseActivity;
import com.pixomatic.weatherinfo.listeners.NetworkRequestListener;
import com.pixomatic.weatherinfo.models.WeatherResponse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity  {


    @BindView(R.id.select_count_relative)
    RelativeLayout selectCountRelative;

    @BindView(R.id.weather_recycler)
    RecyclerView weatherRecycler;

    private InfoWeatherAdapter mInfoWeatherAdapter;
    private Parcelable mRecipeListParcelable;
    private int mScrollPosition = -1;
    LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


//        getWeatherManager().getWeatherResponse(new NetworkRequestListener() {
//            @Override
//            public void onSuccess(String stringJson) {
//
//            }
//
//            @Override
//            public void onError(String error) {
//
//            }
//        },"Tbilisi,GE",getResources().getString(R.string.weather_bit_io_api_key));




    }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int scrollPosition = ((LinearLayoutManager)
                weatherRecycler.getLayoutManager())
                .findFirstCompletelyVisibleItemPosition();
        mRecipeListParcelable = linearLayoutManager.onSaveInstanceState();
        outState.putParcelable("Key_layout", mRecipeListParcelable);
        outState.putInt("position", scrollPosition);
    }



    private void initViews(){

        final LinkedList<String> mTitleList = new LinkedList<>();
        mTitleList.add("Yerevan,AM");
        mTitleList.add("Moscow,Ru");
        mTitleList.add("New York,US");
        mTitleList.add("Rome,IT");
        mTitleList.add("Tbilisi,GE");


        selectCountRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new MaterialDialog.Builder(MainActivity.this)
                        .items(mTitleList)
                        .itemsCallback(new MaterialDialog.ListCallback() {
                            @Override
                            public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                                Toast.makeText(MainActivity.this, text.toString().substring(0,text.length()-3), Toast.LENGTH_SHORT).show();
                                getWeatherManager().getWeatherResponse(new NetworkRequestListener() {
                                    @Override
                                    public void onSuccess(String stringJson) {

                                        WeatherResponse weatherResponse = new Gson().fromJson(stringJson,WeatherResponse.class);
                                        if(weatherResponse != null && weatherResponse.getData()!= null && !weatherResponse.getData().isEmpty()){


                                            if(mInfoWeatherAdapter != null && !mInfoWeatherAdapter.getmDatumList().isEmpty()){

                                                mInfoWeatherAdapter.addDatumList(weatherResponse.getData().get(0));
                                                mInfoWeatherAdapter.notifyDataSetChanged();
                                                weatherRecycler.scrollToPosition(mInfoWeatherAdapter.getmDatumList().size()-1);

                                            }else {
                                                mInfoWeatherAdapter = new InfoWeatherAdapter(MainActivity.this,weatherResponse.getData());
                                                weatherRecycler.setAdapter(mInfoWeatherAdapter);
                                                 linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                                                weatherRecycler.setLayoutManager(linearLayoutManager);
                                                weatherRecycler.setHasFixedSize(false);
                                            }


                                        }



                                    }

                                    @Override
                                    public void onError(String error) {

                                    }
                                },text.toString(),getResources().getString(R.string.weather_bit_io_api_key));
                            }
                        })

                        .show();


            }
        });
    }


    private void sendRequest(String cityName){

    }

    @Override
    protected void onResume() {
        initViews();
        super.onResume();

    }
}
