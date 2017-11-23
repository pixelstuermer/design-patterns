package com.github.pixelstuermer.patterns.adapter.models;

public class WilderTruthahn implements Truthahn {

   @Override
   public void kollern() {
      System.out.println( "Koller Koller" );
   }

   @Override
   public void fliegen() {
      System.out.println( "Ich fliege nur kurze Strecken" );
   }

}
