package com.desgin.patterns.observer;

/**
 * Created by Yann on 2015/5/29.
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay();

        weatherData.registerObserver(conditionsDisplay);
        weatherData.setMeasurements(80, 70, 29.2f);
    }

}
