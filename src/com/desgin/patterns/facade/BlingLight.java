package com.desgin.patterns.facade;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class BlingLight implements Light {
    @Override
    public void on() {
        System.out.println("lighting");
    }
}
