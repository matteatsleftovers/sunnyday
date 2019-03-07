package com.detroitlabs.sunnyday.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicWeatherDataTest {

    private BasicWeatherData subject;

    @Before
    public void setUp() {
        subject = new BasicWeatherData();
    }

    @Test
    public void getTempF_should_return_32_f_when_273_15_K() {
        subject.setTemp(273.15);
        double tempF = subject.getTempF();
        assertEquals(32.0, tempF, 0.001);
    }

    @Test
    public void getTempF_should_return_212_f_when_373_15_K() {
        subject.setTemp(373.15);
        double tempF = subject.getTempF();
        assertEquals(212.0, tempF, 0.001);
    }
}