package com.github.pixelstuermer.patterns.factory.method.models;

public class BerlinerSalamiPizza extends Pizza {

   public BerlinerSalamiPizza() {
      super();
      name = "Salamipizza Berliner Art";
      teig = "Teig mit knuspriger Kruste";
      sosse = "Keine Sosse";
      belaege.add( "Salami" );
   }

}
