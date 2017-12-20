package com.github.pixelstuermer.patterns.proxy.remote.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

   public String sayHello( String param ) throws RemoteException;

   public double calculateSomeStuff( double val1, double val2 ) throws RemoteException;

}
