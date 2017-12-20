package com.github.pixelstuermer.patterns.proxy.remote.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImplementation extends UnicastRemoteObject implements MyRemote {

   private static final long serialVersionUID = -3962220798134571075L;

   public MyRemoteImplementation() throws RemoteException {
      super();
   }

   @Override
   public String sayHello( String param ) throws RemoteException {
      return "Hello " + param;
   }

   @Override
   public double calculateSomeStuff( double val1, double val2 ) throws RemoteException {
      return Double.valueOf( val1 * val2 );
   }

}
