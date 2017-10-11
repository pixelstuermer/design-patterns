package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtMitFluegeln;
import com.github.pixelstuermer.patterns.strategy.interfaces.Quaken;

public class MoorEnte extends Ente {

   public MoorEnte() {
      this.setQuakVerhalten( new Quaken() );
      this.setFlugVerhalten( new FliegtMitFluegeln() );
   }

   @Override
   public String anzeigen() {
      return "Anzeigen: Sieht aus wie eine Moorente";
   }
}
