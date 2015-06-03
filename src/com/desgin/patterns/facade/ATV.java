package com.desgin.patterns.facade;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class ATV implements TV {
    @Override
    public void on() {
        System.out.println("tv on");
    }
}
