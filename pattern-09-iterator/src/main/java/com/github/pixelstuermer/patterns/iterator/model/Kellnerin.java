package com.github.pixelstuermer.patterns.iterator.model;

import com.github.pixelstuermer.patterns.iterator.iterator.Iterator;

public class Kellnerin {

   private PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte;
   private RestaurantSpeisekarte restaurantSpeisekarte;

   public Kellnerin( PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte,
               RestaurantSpeisekarte restaurantSpeisekarte ) {
      this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
      this.restaurantSpeisekarte = restaurantSpeisekarte;
   }

   public void speisekarteAusgeben() {
      System.out.println( "--- PRANNKUCHEN ---" );
      speisekarteAusgeben( pfannkuchenhausSpeisekarte.createIterator() );

      System.out.println( "\n--- RESTAURANT ---" );
      speisekarteAusgeben( restaurantSpeisekarte.createIterator() );
   }

   private void speisekarteAusgeben( Iterator iterator ) {
      while ( iterator.hasNext() ) {
         System.out.println( ((Speise) iterator.next()).toString() );
      }
   }

}
