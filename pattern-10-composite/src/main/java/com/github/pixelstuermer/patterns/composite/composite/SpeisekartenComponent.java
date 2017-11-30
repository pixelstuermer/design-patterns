package com.github.pixelstuermer.patterns.composite.composite;

import java.util.Iterator;

public abstract class SpeisekartenComponent {

   // Komposita methods

   public void add( SpeisekartenComponent speisekartenComponent ) {
      throw new UnsupportedOperationException();
   }

   public SpeisekartenComponent getChild( int i ) {
      throw new UnsupportedOperationException();
   }

   // Operation methods

   public String getName() {
      throw new UnsupportedOperationException();
   }

   public double getPrice() {
      throw new UnsupportedOperationException();
   }

   // Special methods

   public void ausgeben() {
      throw new UnsupportedOperationException();
   }

   public abstract Iterator<?> createIterator();

}
