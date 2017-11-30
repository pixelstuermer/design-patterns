package com.github.pixelstuermer.patterns.composite.model;

import java.util.Iterator;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;
import com.github.pixelstuermer.patterns.composite.iterator.NullIterator;

public class Speise extends SpeisekartenComponent {

   private String name;
   private double price;

   public Speise( String name, double preis ) {
      this.name = name;
      this.price = preis;
   }

   @Override
   public String getName() {
      return name;
   }

   public void setName( String name ) {
      this.name = name;
   }

   @Override
   public double getPrice() {
      return price;
   }

   public void setPrice( double preis ) {
      this.price = preis;
   }

   @Override
   public void ausgeben() {
      System.out.println( "Name: " + name + " / Preis: " + price );
   }

   @Override
   public Iterator<?> createIterator() {
      return new NullIterator();
   }

}
