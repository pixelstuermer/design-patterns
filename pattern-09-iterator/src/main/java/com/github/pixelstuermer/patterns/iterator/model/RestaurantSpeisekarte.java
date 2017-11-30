package com.github.pixelstuermer.patterns.iterator.model;

import com.github.pixelstuermer.patterns.iterator.iterator.Iterator;
import com.github.pixelstuermer.patterns.iterator.iterator.RestaurantSpeisekartenIterator;

public class RestaurantSpeisekarte {

   private static final int MAX_SPEISEN = 6;
   private int counterSpeisen;
   private Speise[] speisen;

   public RestaurantSpeisekarte() {
      counterSpeisen = 0;
      speisen = new Speise[MAX_SPEISEN];
      addSpeise( "Schinken-Sandwhich", 5.99 );
      addSpeise( "HotDog", 3.99 );
   }

   private void addSpeise( String name, double preis ) {
      if ( counterSpeisen >= MAX_SPEISEN ) {
         // NOP
         System.out.println( "Too many Speisen ..." );
      }
      else {
         speisen[counterSpeisen] = new Speise( name, preis );
         counterSpeisen++;
      }
   }

   public Iterator createIterator() {
      return new RestaurantSpeisekartenIterator( speisen );
   }

}
