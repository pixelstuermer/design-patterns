package com.github.pixelstuermer.patterns.decorator.models;

public class Kaffee extends Getraenk {

   public Kaffee() {
      beschreibung = "Kaffee";
   }

   @Override
   public double getPreis() {
      return 0.99;
   }

}
