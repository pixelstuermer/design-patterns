package com.github.pixelstuermer.patterns.factory.simple.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

   public String name;
   public String teig;
   public String sosse;
   public List<String> belaege;

   public Pizza() {
      belaege = new ArrayList<>();
   }

   public void zubereiten() {
      System.out.println( "Starte " + name );
      System.out.println( "Werfe Teig " + teig );
      System.out.println( "Ruehre " + sosse );
      for ( String belag : belaege ) {
         System.out.println( "\tPlus Belag " + belag );
      }
   }

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
