package com.desgin.patterns.facade;

/**
 * Created by Yann.Xia on 2015/6/3.
 */
public class TestFacade {

    public static void main(String[] args) {
        new WatchTV(new ATV(), new BlingLight(), new APower()).on();
    }
}
