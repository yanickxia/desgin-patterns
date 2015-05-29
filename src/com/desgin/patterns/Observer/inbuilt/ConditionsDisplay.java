package com.desgin.patterns.Observer.inbuilt;

import com.desgin.patterns.Observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yann on 2015/5/29.
 */
public class ConditionsDisplay implements Observer, DisplayElement {

    private Observable observer;
    private float temperature;
    private float humidity;
    private float pressure;

    public ConditionsDisplay(Observable observer) {
        this.observer = observer;
        this.observer.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + "F degree and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            display();
        }
    }
}
