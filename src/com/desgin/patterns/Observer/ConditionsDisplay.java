package com.desgin.patterns.observer;

/**
 * Created by Yann on 2015/5/29.
 */
public class ConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + "F degree and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
