package com.desgin.patterns.state;

/**
 * Created by Yann on 2015/6/8.
 */
public class GumballMachine implements State {

    private State hasQuarter;
    private State noQuarter;


    private State state;

    public GumballMachine(int count) {

        this.count = count;
        this.hasQuarter = new HasQuarterState(this);
        this.noQuarter = new NoQuarterState(this);


        if (isHasQuarterState()) {
            this.state = hasQuarter;
        } else {
            this.state = noQuarter;
        }

    }

    private int count;


    public boolean isHasQuarterState() {
        return count > 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void insertQuarter() {
        this.count++;

        state.insertQuarter();
        state = hasQuarter;
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
        if (!isHasQuarterState()) {
            state = noQuarter;
        }
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
