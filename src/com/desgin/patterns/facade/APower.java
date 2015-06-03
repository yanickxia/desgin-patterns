package com.desgin.patterns.facade;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class APower implements Power {
    @Override
    public void on() {
        System.out.println("the power on");
    }
}
