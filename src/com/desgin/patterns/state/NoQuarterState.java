package com.desgin.patterns.state;

/**
 * Created by Yann on 2015/6/8.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {
        System.out.println("no item to eject");
    }

    @Override
    public void tumCrank() {

    }

    @Override
    public void dispense() {

    }
}
