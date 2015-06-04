package com.desgin.patterns.template;

/**
 * Created by Yann on 2015/6/4.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brwe() {
        System.out.println("coffee brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add coffee condiments");
    }
}
