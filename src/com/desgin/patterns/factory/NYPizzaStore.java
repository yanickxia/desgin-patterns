package com.desgin.patterns.factory;

/**
 * Created by Yann.Xia on 2015/5/31.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if ("chess".equals(type)) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
