package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtMitFluegeln;
import com.github.pixelstuermer.patterns.strategy.interfaces.Quaken;

public class StockEnte extends Ente {

   public StockEnte() {
      this.setQuakVerhalten( new Quaken() );
      this.setFlugVerhalten( new FliegtMitFluegeln() );
   }

   @Override
   public String anzeigen() {
      return "Anzeigen: Sieht aus wie eine Stockente";
   }

}
