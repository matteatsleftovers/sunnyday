package com.detroitlabs.sunnyday.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String name;
    private BasicWeatherData basicWeatherData;
    private TimeZoneData timeZoneData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("main")
    public BasicWeatherData getBasicWeatherData() {
        return basicWeatherData;
    }

    @JsonProperty("main")
    public void setBasicWeatherData(BasicWeatherData basicWeatherData) {
        this.basicWeatherData = basicWeatherData;
    }

    @JsonProperty("sys")
    public TimeZoneData getTimeZoneData() {
        return timeZoneData;
    }

    @JsonProperty("sys")
    public void setTimeZoneData(TimeZoneData timeZoneData) {
        this.timeZoneData = timeZoneData;
    }
}
