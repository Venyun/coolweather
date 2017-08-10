package com.example.venny.coolweather.gson;

/**
 * Created by Venny on 2017/8/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
