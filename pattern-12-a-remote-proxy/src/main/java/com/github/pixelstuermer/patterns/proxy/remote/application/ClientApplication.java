package com.github.pixelstuermer.patterns.proxy.remote.application;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.github.pixelstuermer.patterns.proxy.remote.constants.RmiConstants;
import com.github.pixelstuermer.patterns.proxy.remote.model.MyRemote;

public class ClientApplication {

   public static void main( String[] args ) throws RemoteException, NotBoundException {
      // check for RMI service and server
      Registry reg = LocateRegistry.getRegistry( RmiConstants.SERVER_URI, RmiConstants.SERVER_PORT );
      MyRemote service = (MyRemote) reg.lookup( RmiConstants.SERVICE_NAME );

      System.out.println( ">>> Client: Client started" );

      // check for command line arguments
      if ( args.length > 0 && args[0] != null && args[0].length() > 0 ) {
         System.out.println( ">>> Client: " + service.sayHello( args[0] ) );
      }
      else {
         System.out.println( ">>> Client: " + service.sayHello( "Joe" ) );
      }
      System.out.println( ">>> Client: " + service.calculateSomeStuff( 7, 3 ) );
   }

}
