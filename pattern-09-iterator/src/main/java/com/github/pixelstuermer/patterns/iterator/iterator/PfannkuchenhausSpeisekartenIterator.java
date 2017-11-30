package com.github.pixelstuermer.patterns.iterator.iterator;

import java.util.ArrayList;

import com.github.pixelstuermer.patterns.iterator.model.Speise;

public class PfannkuchenhausSpeisekartenIterator implements Iterator {

   private ArrayList<Speise> speisen;
   private int positionCounter;

   public PfannkuchenhausSpeisekartenIterator( ArrayList<Speise> speisen ) {
      this.speisen = speisen;
      positionCounter = 0;
   }

   @Override
   public boolean hasNext() {
      if ( positionCounter >= speisen.size() || speisen.get( positionCounter ) == null ) {
         return false;
      }
      else {
         return true;
      }
   }

   @Override
   public Object next() {
      Speise speise = speisen.get( positionCounter );
      positionCounter++;
      return speise;
   }

}
