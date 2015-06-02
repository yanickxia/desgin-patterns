package com.desgin.patterns.command;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class Voice {

    private boolean playing = false;

    public void on() {
        playing = true;
        System.out.println("paying");
    }


    public void off() {
        playing = false;
        System.out.println("nothing");
    }
}
