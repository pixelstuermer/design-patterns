package com.github.pixelstuermer.patterns.iterator.model;

import java.util.ArrayList;
import java.util.Iterator;

public class PfannkuchenhausSpeisekarte implements Speisekarte {

   private ArrayList<Speise> speisen;

   public PfannkuchenhausSpeisekarte() {
      speisen = new ArrayList<>();
      addSpeise( "Blaubeer-Pfannkuchen", 7.99 );
      addSpeise( "Waffeln", 3.99 );
   }

   private void addSpeise( String name, double preis ) {
      speisen.add( new Speise( name, preis ) );
   }

   @Override
   public Iterator<Speise> createIterator() {
      return speisen.iterator();
   }

}
