package com.desgin.patterns.state;

/**
 * Created by Yann on 2015/6/8.
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("insert quarter");
    }

    @Override
    public void ejectQuarter() {

        gumballMachine.setCount(gumballMachine.getCount() - 1);
        System.out.println("eject quarter");
    }

    @Override
    public void tumCrank() {
        System.out.println("tum crank");
    }

    @Override
    public void dispense() {
        System.out.println("dispense");
    }
}
