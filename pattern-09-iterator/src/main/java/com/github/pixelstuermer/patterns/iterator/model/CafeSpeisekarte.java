package com.github.pixelstuermer.patterns.iterator.model;

import java.util.HashMap;
import java.util.Iterator;

public class CafeSpeisekarte implements Speisekarte {

   private HashMap<String, Speise> speisen;

   public CafeSpeisekarte() {
      speisen = new HashMap<>();
      addSpeise( "Tagessuppe", 2.99 );
      addSpeise( "Burrito", 3.99 );
   }

   private void addSpeise( String name, double preis ) {
      speisen.put( name, new Speise( name, preis ) );
   }

   @Override
   public Iterator<?> createIterator() {
      return speisen.values().iterator();
   }

}
