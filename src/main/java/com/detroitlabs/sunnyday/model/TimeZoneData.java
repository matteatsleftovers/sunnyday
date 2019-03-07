package com.detroitlabs.sunnyday.model;

import java.time.Instant;
import java.time.ZoneId;

public class TimeZoneData {

    private long sunrise;
    private long sunset;

    public String getSunriseString() {
            return Instant.ofEpochMilli(sunrise).atZone(ZoneId.of("America/Detroit")).toLocalDateTime().toString();
    }

    public String getSunsetString() {
        return Instant.ofEpochMilli(sunset).atZone(ZoneId.of("America/Detroit")).toLocalDateTime().toString();
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }
}
