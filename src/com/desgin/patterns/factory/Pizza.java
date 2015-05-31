package com.desgin.patterns.factory;

import java.util.ArrayList;

/**
 * Created by Yann.Xia on 2015/5/31.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        //Do something
    }

    void bake(){
        System.out.println("baking");
    }

    void cut(){
        System.out.println("cutting");
    }

    void box(){
        System.out.println("boxing");
    }

    public String getName(){
        return name;
    }
}
