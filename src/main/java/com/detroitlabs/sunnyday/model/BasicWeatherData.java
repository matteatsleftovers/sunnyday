package com.detroitlabs.sunnyday.model;

public class BasicWeatherData {

    private double temp;
    private double humidity;

    public double getTempF() {
        return (getTemp() - 273.15) * 1.8 + 32;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
