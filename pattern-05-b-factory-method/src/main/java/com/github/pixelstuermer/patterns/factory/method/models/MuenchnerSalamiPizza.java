package com.github.pixelstuermer.patterns.factory.method.models;

public class MuenchnerSalamiPizza extends Pizza {

   public MuenchnerSalamiPizza() {
      super();
      name = "Salamipizza Muenchner Art";
      teig = "Teig mit extra dicker Kruste";
      sosse = "Keine Sosse";
      belaege.add( "Salami" );
   }

   @Override
   public void schneiden() {
      System.out.println( "Schneide in Rechtecke" );
   }

}
