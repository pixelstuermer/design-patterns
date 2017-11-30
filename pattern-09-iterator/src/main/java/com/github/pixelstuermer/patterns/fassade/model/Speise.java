package com.github.pixelstuermer.patterns.fassade.model;

public class Speise {

   private String name;
   private double preis;

   public Speise( String name, double preis ) {
      this.name = name;
      this.preis = preis;
   }

   public String getName() {
      return name;
   }

   public void setName( String name ) {
      this.name = name;
   }

   public double getPreis() {
      return preis;
   }

   public void setPreis( double preis ) {
      this.preis = preis;
   }

   @Override
   public String toString() {
      return "Name: " + name + " / Preis: " + preis;
   }

}
