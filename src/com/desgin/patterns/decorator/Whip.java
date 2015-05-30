package com.desgin.patterns.decorator;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .19 + beverage.cost();
    }
}
