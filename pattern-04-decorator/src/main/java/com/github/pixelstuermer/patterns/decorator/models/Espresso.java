package com.github.pixelstuermer.patterns.decorator.models;

public class Espresso extends Getraenk {

   public Espresso() {
      beschreibung = "Espresso";
   }

   @Override
   public double getPreis() {
      return 1.99;
   }

}
