package com.desgin.patterns.factory;

/**
 * Created by Yann.Xia on 2015/5/31.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Ny Style pizza";
        dough = "Thin Crust dough";
        sauce = "Maa";

        toppings.add("xxxxx");
    }

    @Override
    void cut() {
        System.out.println("cutting chicago pizza");
    }
}
