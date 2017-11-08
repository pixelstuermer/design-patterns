package com.github.pixelstuermer.patterns.factory.simple.models;

public class MargheritaPizza extends Pizza {

   public MargheritaPizza() {
      super();
      name = "Margheritapizza";
      teig = "Teig mit Kruste";
      sosse = "Normale Sosse";
      belaege.add( "Parmesan" );
      belaege.add( "Tomaten" );
   }

}
