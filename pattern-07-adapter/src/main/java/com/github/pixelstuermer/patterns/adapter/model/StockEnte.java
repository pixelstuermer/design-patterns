package com.github.pixelstuermer.patterns.adapter.model;

public class StockEnte implements Ente {

   @Override
   public void quaken() {
      System.out.println( "Quak Quak" );
   }

   @Override
   public void fliegen() {
      System.out.println( "Ich fliege" );
   }

}
