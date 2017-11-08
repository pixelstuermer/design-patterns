package com.github.pixelstuermer.patterns.factory.method.models;

public class MuenchnerHawaiiPizza extends Pizza {

   public MuenchnerHawaiiPizza() {
      super();
      name = "Hawaiipizza Muenchner Art";
      teig = "Teig mit extra dicker Kruste";
      sosse = "Suesse Sosse";
      belaege.add( "Tomaten" );
      belaege.add( "Ananas" );
   }

   @Override
   public void schneiden() {
      System.out.println( "Schneide in Rechtecke" );
   }

}
