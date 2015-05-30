package com.desgin.patterns.decorator;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
