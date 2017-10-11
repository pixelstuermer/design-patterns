package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FlugVerhalten;
import com.github.pixelstuermer.patterns.strategy.interfaces.QuakVerhalten;

public abstract class Ente {

   private FlugVerhalten flugVerhalten;
   private QuakVerhalten quakVerhalten;

   public Ente() {
      // NOP
   }

   public void setFlugVerhalten( FlugVerhalten flugVerhalten ) {
      this.flugVerhalten = flugVerhalten;
   }

   public void setQuakVerhalten( QuakVerhalten quakVerhalten ) {
      this.quakVerhalten = quakVerhalten;
   }

   public abstract String anzeigen();

   public String schwimmen() {
      return "Schwimmen: Schwimmt wie eine normale Ente";
   }

   public String tuFliegen() {
      return flugVerhalten.fliegen();
   }

   public String tuQuaken() {
      return quakVerhalten.quaken();
   }

}
