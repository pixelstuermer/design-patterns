package com.github.pixelstuermer.patterns.proxy.virtual.model;

public class OutputSubject implements Output {

   private String text;

   public OutputSubject( String text ) {
      this.text = text;

      try {
         // placeholder for a long/complex instantiation
         Thread.sleep( 4000 );
      }
      catch ( InterruptedException e ) {
         e.printStackTrace();
      }
   }

   @Override
   public void printInfo() {
      System.out.println( "Output Subject: " + text );
   }

}
