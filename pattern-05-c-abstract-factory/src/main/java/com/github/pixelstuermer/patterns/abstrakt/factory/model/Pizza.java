package com.github.pixelstuermer.patterns.abstrakt.factory.model;

public abstract class Pizza {

   public String name;
   public Teig teig;
   public Sosse sosse;
   public Krabben krabben;

   public Pizza() {
   }

   public abstract void vorbereiten();

   public void backen() {
      System.out.println( "Backen bei 200 Grad" );
   }

   public void schneiden() {
      System.out.println( "Schneide in Dreiecke" );
   }

   public void verpacken() {
      System.out.println( "Packe in Karton" );
   }

}
