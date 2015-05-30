package com.desgin.patterns.decorator;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
