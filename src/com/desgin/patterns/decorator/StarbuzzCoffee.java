package com.desgin.patterns.decorator;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " cost: " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " cost: " + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " cost: " + beverage3.cost());
    }
}
