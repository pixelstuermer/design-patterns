package com.github.pixelstuermer.patterns.factory.method.models;

public class BerlinerHawaiiPizza extends Pizza {

   public BerlinerHawaiiPizza() {
      super();
      name = "Hawaiipizza Berliner";
      teig = "Teig mit knuspriger Kruste";
      sosse = "Suesse Sosse";
      belaege.add( "Tomaten" );
      belaege.add( "Ananas" );
   }

}
