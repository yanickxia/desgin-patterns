package com.desgin.patterns.command;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class Light {

    private boolean lighting = false;

    public void on() {
        lighting = true;
        System.out.println("lighting");
    }

    public void off() {
        lighting = false;
        System.out.println("darking");
    }

}
