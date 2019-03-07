package com.detroitlabs.sunnyday.controller;

import com.detroitlabs.sunnyday.model.Forecast;
import com.detroitlabs.sunnyday.model.TimeZoneData;
import com.detroitlabs.sunnyday.model.BasicWeatherData;
import com.detroitlabs.sunnyday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/")
    public String displayWeather(ModelMap modelMap) {
        Forecast forecast = weatherService.fetchWeatherData();
        modelMap.put("cityName", forecast.getName());
        BasicWeatherData basicWeatherData = forecast.getBasicWeatherData();
        modelMap.put("basicWeatherData", basicWeatherData);
        TimeZoneData timeZoneData = forecast.getTimeZoneData();
        modelMap.put("timeZoneData", timeZoneData);
        return "home";
    }
}
