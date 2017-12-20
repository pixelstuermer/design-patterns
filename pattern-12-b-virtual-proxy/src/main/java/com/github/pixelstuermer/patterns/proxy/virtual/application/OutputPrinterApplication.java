package com.github.pixelstuermer.patterns.proxy.virtual.application;

import com.github.pixelstuermer.patterns.proxy.virtual.model.Output;
import com.github.pixelstuermer.patterns.proxy.virtual.model.OutputProxy;

public class OutputPrinterApplication {

   public static void main( String[] args ) {
      Output output = new OutputProxy( "Hello World" );
      for ( int i = 0; i < 10; i++ ) {
         output.printInfo();
         try {
            Thread.sleep( 1000 );
         }
         catch ( InterruptedException e ) {
         }
      }
   }

}
