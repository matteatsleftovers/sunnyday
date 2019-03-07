package com.detroitlabs.sunnyday.service;

import com.detroitlabs.sunnyday.model.Forecast;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    public Forecast fetchWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "http://api.openweathermap.org/" +
                "data/2.5/weather?q=Detroit" +
                "&APPID=3397e242f4c306e5875092fcba62cebc",
                Forecast.class
        );
    }

}
