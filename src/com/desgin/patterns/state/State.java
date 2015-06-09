package com.desgin.patterns.state;

/**
 * Created by Yann on 2015/6/7.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void tumCrank();
    void dispense();
}
