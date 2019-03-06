package com.detroitlabs.sunnyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    @RequestMapping("/")
    public String displayWeather() {
        return "home";
    }
}
