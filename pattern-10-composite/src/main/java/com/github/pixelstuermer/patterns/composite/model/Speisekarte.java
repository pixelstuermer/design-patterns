package com.github.pixelstuermer.patterns.composite.model;

import java.util.ArrayList;
import java.util.Iterator;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;
import com.github.pixelstuermer.patterns.composite.iterator.KompositumIterator;

public class Speisekarte extends SpeisekartenComponent {

   private ArrayList<SpeisekartenComponent> speisekartenComponent;
   private String name;

   public Speisekarte( String name ) {
      speisekartenComponent = new ArrayList<>();
      this.name = name;
   }

   @Override
   public void add( SpeisekartenComponent speisekartenComponent ) {
      this.speisekartenComponent.add( speisekartenComponent );
   }

   @Override
   public SpeisekartenComponent getChild( int i ) {
      return speisekartenComponent.get( i );
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void ausgeben() {
      Iterator<?> iterator = speisekartenComponent.iterator();
      while ( iterator.hasNext() ) {
         ((SpeisekartenComponent) iterator.next()).ausgeben();
      }
   }

   @Override
   public Iterator<?> createIterator() {
      return new KompositumIterator( speisekartenComponent.iterator() );
   }

}
