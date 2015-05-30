package com.desgin.patterns.observer.inbuilt;

import java.util.Observable;

/**
 * Created by Yann on 2015/5/29.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }
}
