package com.desgin.patterns.singleton;

/**
 * Created by Yann on 2015/6/1.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

}
