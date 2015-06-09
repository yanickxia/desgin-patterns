package com.desgin.patterns.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Yann on 2015/6/9.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {


    private int count = 0;
    private State state;

    protected GumballMachine(int count, State state) throws RemoteException {
        this.count = count;
        this.state = state;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }
}
