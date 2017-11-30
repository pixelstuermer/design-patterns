package com.github.pixelstuermer.patterns.iterator.model;

import java.util.Iterator;

public class Kellnerin {

   private Speisekarte pfannkuchenhausSpeisekarte;
   private Speisekarte restaurantSpeisekarte;
   private Speisekarte cafeSpeisekarte;

   public Kellnerin( Speisekarte pfannkuchenhausSpeisekarte,
               Speisekarte restaurantSpeisekarte,
               Speisekarte cafeSpeisekarte ) {
      this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
      this.restaurantSpeisekarte = restaurantSpeisekarte;
      this.cafeSpeisekarte = cafeSpeisekarte;
   }

   public void speisekarteAusgeben() {
      System.out.println( "--- PRANNKUCHEN ---" );
      speisekarteAusgeben( pfannkuchenhausSpeisekarte.createIterator() );

      System.out.println( "\n--- RESTAURANT ---" );
      speisekarteAusgeben( restaurantSpeisekarte.createIterator() );

      System.out.println( "\n--- CAFE ---" );
      speisekarteAusgeben( cafeSpeisekarte.createIterator() );
   }

   private void speisekarteAusgeben( Iterator<?> iterator ) {
      while ( iterator.hasNext() ) {
         System.out.println( ((Speise) iterator.next()).toString() );
      }
   }

}
