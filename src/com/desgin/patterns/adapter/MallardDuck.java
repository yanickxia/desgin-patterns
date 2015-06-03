package com.desgin.patterns.adapter;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
