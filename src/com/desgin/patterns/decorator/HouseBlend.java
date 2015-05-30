package com.desgin.patterns.decorator;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
