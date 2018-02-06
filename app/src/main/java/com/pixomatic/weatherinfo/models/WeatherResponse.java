package com.pixomatic.weatherinfo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mno on 2/6/18.
 */

public class WeatherResponse implements Serializable {


    public WeatherResponse() {
    }
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("count")
    @Expose
    private Double count;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }


    public class Datum implements Serializable{

        public Datum() {
        }

        @SerializedName("rh")
        @Expose
        private Double rh;
        @SerializedName("pod")
        @Expose
        private String pod;
        @SerializedName("pres")
        @Expose
        private Double pres;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("weather")
        @Expose
        private Weather weather;
        @SerializedName("country_code")
        @Expose
        private String countryCode;
        @SerializedName("clouds")
        @Expose
        private Double clouds;
        @SerializedName("vis")
        @Expose
        private Double vis;
        @SerializedName("wind_spd")
        @Expose
        private Double windSpd;
        @SerializedName("wind_cdir_full")
        @Expose
        private String windCdirFull;
        @SerializedName("ob_time")
        @Expose
        private String obTime;
        @SerializedName("app_temp")
        @Expose
        private Double appTemp;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("state_code")
        @Expose
        private String stateCode;
        @SerializedName("ts")
        @Expose
        private Double ts;
        @SerializedName("elev_angle")
        @Expose
        private Double elevAngle;
        @SerializedName("h_angle")
        @Expose
        private Double hAngle;
        @SerializedName("dewpt")
        @Expose
        private Double dewpt;
        @SerializedName("snow")
        @Expose
        private Double snow;
        @SerializedName("uv")
        @Expose
        private Double uv;
        @SerializedName("sunset")
        @Expose
        private String sunset;
        @SerializedName("sunrise")
        @Expose
        private String sunrise;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("precip")
        @Expose
        private Double precip;
        @SerializedName("station")
        @Expose
        private String station;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("dhi")
        @Expose
        private Double dhi;
        @SerializedName("datetime")
        @Expose
        private String datetime;
        @SerializedName("temp")
        @Expose
        private Double temp;
        @SerializedName("wind_dir")
        @Expose
        private Double windDir;
        @SerializedName("slp")
        @Expose
        private Double slp;
        @SerializedName("wind_cdir")
        @Expose
        private String windCdir;

        public Double getRh() {
            return rh;
        }

        public void setRh(Double rh) {
            this.rh = rh;
        }

        public String getPod() {
            return pod;
        }

        public void setPod(String pod) {
            this.pod = pod;
        }

        public Double getPres() {
            return pres;
        }

        public void setPres(Double pres) {
            this.pres = pres;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Weather getWeather() {
            return weather;
        }

        public void setWeather(Weather weather) {
            this.weather = weather;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public Double getClouds() {
            return clouds;
        }

        public void setClouds(Double clouds) {
            this.clouds = clouds;
        }

        public Double getVis() {
            return vis;
        }

        public void setVis(Double vis) {
            this.vis = vis;
        }

        public Double getWindSpd() {
            return windSpd;
        }

        public void setWindSpd(Double windSpd) {
            this.windSpd = windSpd;
        }

        public String getWindCdirFull() {
            return windCdirFull;
        }

        public void setWindCdirFull(String windCdirFull) {
            this.windCdirFull = windCdirFull;
        }

        public String getObTime() {
            return obTime;
        }

        public void setObTime(String obTime) {
            this.obTime = obTime;
        }

        public Double getAppTemp() {
            return appTemp;
        }

        public void setAppTemp(Double appTemp) {
            this.appTemp = appTemp;
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public String getStateCode() {
            return stateCode;
        }

        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }

        public Double getTs() {
            return ts;
        }

        public void setTs(Double ts) {
            this.ts = ts;
        }

        public Double getElevAngle() {
            return elevAngle;
        }

        public void setElevAngle(Double elevAngle) {
            this.elevAngle = elevAngle;
        }

        public Double getHAngle() {
            return hAngle;
        }

        public void setHAngle(Double hAngle) {
            this.hAngle = hAngle;
        }

        public Double getDewpt() {
            return dewpt;
        }

        public void setDewpt(Double dewpt) {
            this.dewpt = dewpt;
        }

        public Double getSnow() {
            return snow;
        }

        public void setSnow(Double snow) {
            this.snow = snow;
        }

        public Double getUv() {
            return uv;
        }

        public void setUv(Double uv) {
            this.uv = uv;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Double getPrecip() {
            return precip;
        }

        public void setPrecip(Double precip) {
            this.precip = precip;
        }

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getDhi() {
            return dhi;
        }

        public void setDhi(Double dhi) {
            this.dhi = dhi;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getWindDir() {
            return windDir;
        }

        public void setWindDir(Double windDir) {
            this.windDir = windDir;
        }

        public Double getSlp() {
            return slp;
        }

        public void setSlp(Double slp) {
            this.slp = slp;
        }

        public String getWindCdir() {
            return windCdir;
        }

        public void setWindCdir(String windCdir) {
            this.windCdir = windCdir;
        }

    }


    public class Weather {

        @SerializedName("icon")
        @Expose
        private String icon;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("description")
        @Expose
        private String description;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

}
