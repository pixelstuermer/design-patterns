package com.github.pixelstuermer.patterns.decorator.models;

public class Schoko extends ZutatDekorierer {

   public Getraenk getraenk;

   public Schoko( Getraenk getraenk ) {
      beschreibung = "Schoko";
      this.getraenk = getraenk;
   }

   @Override
   public String getBeschreibung() {
      return getraenk.getBeschreibung() + ", " + beschreibung;
   }

   @Override
   public double getPreis() {
      return getraenk.getPreis() + 0.49;
   }

}
