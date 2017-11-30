package com.github.pixelstuermer.patterns.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;
import com.github.pixelstuermer.patterns.composite.model.Speisekarte;

public class KompositumIterator implements Iterator<Object> {

   private Stack<Iterator<?>> stack;

   public KompositumIterator( Iterator<?> iterator ) {
      stack.push( iterator );
   }

   @Override
   public boolean hasNext() {
      if ( stack.empty() ) {
         return false;
      }
      else {
         Iterator<?> iterator = stack.peek();
         if ( !iterator.hasNext() ) {
            stack.pop();
            return hasNext();
         }
         else {
            return true;
         }
      }
   }

   @Override
   public Object next() {
      if ( hasNext() ) {
         Iterator<?> iterator = stack.peek();
         SpeisekartenComponent speisekartenComponent = (SpeisekartenComponent) iterator.next();
         if ( speisekartenComponent instanceof Speisekarte ) {
            stack.push( ((Speisekarte) speisekartenComponent).createIterator() );
         }
         return speisekartenComponent;
      }
      else {
         return null;
      }
   }

}
