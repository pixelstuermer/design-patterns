package com.github.pixelstuermer.patterns.proxy.remote.application;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.github.pixelstuermer.patterns.proxy.remote.constants.RmiConstants;
import com.github.pixelstuermer.patterns.proxy.remote.model.MyRemote;
import com.github.pixelstuermer.patterns.proxy.remote.model.MyRemoteImplementation;

public class ServerApplication {

   public static void main( String[] args ) throws RemoteException, AlreadyBoundException {
      // start RMI server and service
      MyRemote service = new MyRemoteImplementation();
      Registry registry = LocateRegistry.createRegistry( RmiConstants.SERVER_PORT );
      registry.bind( RmiConstants.SERVICE_NAME, service );

      System.out.println( ">>> Server: Server started" );
   }

}
