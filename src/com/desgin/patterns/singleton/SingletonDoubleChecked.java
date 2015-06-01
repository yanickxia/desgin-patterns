package com.desgin.patterns.singleton;

/**
 * Created by Yann on 2015/6/1.
 */
public class SingletonDoubleChecked {

    private volatile static SingletonDoubleChecked singleton;

    private SingletonDoubleChecked() {
    }

    public static SingletonDoubleChecked getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleChecked.class) {
                singleton = new SingletonDoubleChecked();
            }
        }

        return singleton;
    }

}
