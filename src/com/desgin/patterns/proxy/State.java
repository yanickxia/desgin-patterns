package com.desgin.patterns.proxy;

import java.io.Serializable;

/**
 * Created by Yann on 2015/6/9.
 */
public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
