package com.github.pixelstuermer.patterns.composite.model;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;

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
   public String toString() {
      return "Name: " + name + " / Preis: " + price;
   }

   @Override
   public void ausgeben() {
      System.out.println( "Name: " + name + " / Preis: " + price );
   }

}
