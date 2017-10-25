package com.github.pixelstuermer.patterns.decorator.models;

public abstract class Getraenk {

   public String beschreibung;

   public Getraenk() {
      beschreibung = "unbekanntes Getraenk";
   }

   public String getBeschreibung() {
      return beschreibung;
   }

   public abstract double getPreis();

}
