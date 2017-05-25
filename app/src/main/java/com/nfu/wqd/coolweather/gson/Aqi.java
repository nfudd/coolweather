package com.nfu.wqd.coolweather.gson;

/**
 * Created by Administrator on 2017/5/25 0025.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
