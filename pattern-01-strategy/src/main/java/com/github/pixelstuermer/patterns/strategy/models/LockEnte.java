package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtMitFluegeln;
import com.github.pixelstuermer.patterns.strategy.interfaces.StummesQuaken;

public class LockEnte extends Ente {

   public LockEnte() {
      this.setQuakVerhalten( new StummesQuaken() );
      this.setFlugVerhalten( new FliegtMitFluegeln() );
   }

   @Override
   public String anzeigen() {
      return "Anzeigen: Sieht aus wie eine Lockente";
   }

   @Override
   public String schwimmen() {
      return "Schwimmen: Schwimmt gerade noch so ...";
   }

}
