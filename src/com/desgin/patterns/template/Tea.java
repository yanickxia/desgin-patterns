package com.desgin.patterns.template;

/**
 * Created by Yann on 2015/6/4.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brwe() {
        System.out.println("tea brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add tea condiments");
    }
}
