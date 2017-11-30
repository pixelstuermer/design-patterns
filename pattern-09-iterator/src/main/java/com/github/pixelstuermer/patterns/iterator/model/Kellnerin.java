package com.github.pixelstuermer.patterns.iterator.model;

import java.util.ArrayList;

public class Kellnerin {

   private PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte;
   private RestaurantSpeisekarte restaurantSpeisekarte;

   public Kellnerin( PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte,
               RestaurantSpeisekarte restaurantSpeisekarte ) {
      this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
      this.restaurantSpeisekarte = restaurantSpeisekarte;
   }

   public void speisekarteAusgeben() {
      ArrayList<Speise> pfannkuchenSpeisen = pfannkuchenhausSpeisekarte.getSpeisen();
      Speise[] speisen = restaurantSpeisekarte.getSpeisen();

      System.out.println( "--- PRANNKUCHEN ---" );
      for ( int i = 0; i <= pfannkuchenSpeisen.size(); i++ ) {
         System.out.println( pfannkuchenSpeisen.get( i ).toString() );
      }

      System.out.println( "--- RESTAURANT ---" );
      for ( int i = 0; i <= speisen.length; i++ ) {
         System.out.println( speisen[i].toString() );
      }
   }

}
