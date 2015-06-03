package com.desgin.patterns.facade;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class WatchTV {
    TV tv;
    Light light;
    Power power;

    public WatchTV(TV tv, Light light, Power power) {
        this.tv = tv;
        this.light = light;
        this.power = power;
    }

    public void on() {
        power.on();
        light.on();
        light.on();
    }
}
