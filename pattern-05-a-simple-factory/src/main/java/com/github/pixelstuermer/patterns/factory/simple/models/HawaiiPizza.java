package com.github.pixelstuermer.patterns.factory.simple.models;

public class HawaiiPizza extends Pizza {

   public HawaiiPizza() {
      super();
      name = "Hawaiipizza";
      teig = "Teig mit Kruste";
      sosse = "Suesse Sosse";
      belaege.add( "Tomaten" );
      belaege.add( "Ananas" );
   }

}
