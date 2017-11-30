package com.github.pixelstuermer.patterns.iterator.model;

import java.util.ArrayList;

import com.github.pixelstuermer.patterns.iterator.iterator.Iterator;
import com.github.pixelstuermer.patterns.iterator.iterator.PfannkuchenhausSpeisekartenIterator;

public class PfannkuchenhausSpeisekarte {

   private ArrayList<Speise> speisen;

   public PfannkuchenhausSpeisekarte() {
      speisen = new ArrayList<>();
      addSpeise( "Blaubeer-Pfannkuchen", 7.99 );
      addSpeise( "Waffeln", 3.99 );
   }

   private void addSpeise( String name, double preis ) {
      speisen.add( new Speise( name, preis ) );
   }

   public Iterator createIterator() {
      return new PfannkuchenhausSpeisekartenIterator( speisen );
   }

}
