package com.github.pixelstuermer.patterns.factory.simple.models;

public class SalamiPizza extends Pizza {

   public SalamiPizza() {
      super();
      name = "Salamipizza";
      teig = "Teig mit Kruste";
      sosse = "Keine Sosse";
      belaege.add( "Salami" );
   }

}
