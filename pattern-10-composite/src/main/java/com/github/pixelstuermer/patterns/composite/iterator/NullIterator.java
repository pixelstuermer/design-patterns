package com.github.pixelstuermer.patterns.composite.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator<Object> {

   @Override
   public boolean hasNext() {
      return false;
   }

   @Override
   public Object next() {
      return null;
   }

}
