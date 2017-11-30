package com.github.pixelstuermer.patterns.iterator.iterator;

import com.github.pixelstuermer.patterns.iterator.model.Speise;

public class RestaurantSpeisekartenIterator implements Iterator {

   private Speise[] speisen;
   private int positionCounter;

   public RestaurantSpeisekartenIterator( Speise[] speisen ) {
      this.speisen = speisen;
      positionCounter = 0;
   }

   @Override
   public boolean hasNext() {
      if ( positionCounter >= speisen.length || speisen[positionCounter] == null ) {
         return false;
      }
      else {
         return true;
      }
   }

   @Override
   public Object next() {
      Speise speise = speisen[positionCounter];
      positionCounter++;
      return speise;
   }

}
