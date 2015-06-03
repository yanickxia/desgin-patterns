package com.desgin.patterns.adapter;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("flying short");
    }
}
