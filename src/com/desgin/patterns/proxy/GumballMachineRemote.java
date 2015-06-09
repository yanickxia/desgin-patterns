package com.desgin.patterns.proxy;

import java.rmi.RemoteException;

/**
 * Created by Yann on 2015/6/9.
 */
public interface GumballMachineRemote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;

}
