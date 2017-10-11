package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtGarNicht;
import com.github.pixelstuermer.patterns.strategy.interfaces.StummesQuaken;

public class LockEnte extends Ente {

   public LockEnte() {
      this.setQuakVerhalten( new StummesQuaken() );
      this.setFlugVerhalten( new FliegtGarNicht() );
   }

   @Override
   public String anzeigen() {
      return "Anzeigen: Sieht aus wie ein Stueck Holz";
   }

   @Override
   public String schwimmen() {
      return "Schwimmen: Schwimmt gerade noch so ...";
   }

}
