package com.desgin.patterns.state;

/**
 * Created by Yann on 2015/6/8.
 */
public class TestState {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();

    }

}
