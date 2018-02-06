package com.pixomatic.weatherinfo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pixomatic.weatherinfo.R;
import com.pixomatic.weatherinfo.base.BaseActivity;
import com.pixomatic.weatherinfo.models.WeatherResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dev on 2/6/18.
 */

public class InfoWeatherAdapter extends RecyclerView.Adapter<InfoWeatherAdapter.ViewHolder> {

    private BaseActivity mBaseActivity;
    private LayoutInflater inflater;
    private List<WeatherResponse.Datum> mDatumList;



    public InfoWeatherAdapter(BaseActivity baseActivity, List<WeatherResponse.Datum> datumList) {
        this.mBaseActivity = baseActivity;
        this.inflater = LayoutInflater.from(baseActivity);
        this.mDatumList = datumList;

    }



    @Override
    public InfoWeatherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new InfoWeatherAdapter.ViewHolder(inflater.inflate(R.layout.info_weather_item,
                parent,false));
    }

    @Override
    public void onBindViewHolder(InfoWeatherAdapter.ViewHolder holder, int position) {

        holder.timeZone.setText( " " + mDatumList.get(position).getTimezone());
        holder.cityName.setText(mDatumList.get(position).getCityName());
        String temperature = mDatumList.get(position).getTemp()   + mBaseActivity.getResources().getString(R.string.celsius_character);
        holder.temperature.setText(temperature);
        holder.description.setText(mDatumList.get(position).getWeather().getDescription());



    }




    public List<WeatherResponse.Datum> getmDatumList(){
        return mDatumList;
    }

    public void addDatumList(WeatherResponse.Datum datum){
        mDatumList.add(datum);

    }

    @Override
    public int getItemCount() {
        return mDatumList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.time_zone)
        TextView timeZone;

        @BindView(R.id.description)
        TextView description;



        @BindView(R.id.city_name)
        TextView cityName;

        @BindView(R.id.temperature)
        TextView temperature;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
