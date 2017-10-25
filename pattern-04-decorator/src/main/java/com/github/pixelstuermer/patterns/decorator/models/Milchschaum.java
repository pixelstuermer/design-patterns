package com.github.pixelstuermer.patterns.decorator.models;

public class Milchschaum extends ZutatDekorierer {

   public Getraenk getraenk;

   public Milchschaum( Getraenk getraenk ) {
      beschreibung = "Milchschaum";
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
