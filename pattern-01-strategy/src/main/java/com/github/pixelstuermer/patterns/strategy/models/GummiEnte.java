package com.github.pixelstuermer.patterns.strategy.models;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtGarNicht;
import com.github.pixelstuermer.patterns.strategy.interfaces.Quietschen;

public class GummiEnte extends Ente {

   public GummiEnte() {
      this.setQuakVerhalten( new Quietschen() );
      this.setFlugVerhalten( new FliegtGarNicht() );
   }

   @Override
   public String anzeigen() {
      return "Anzeigen: Sieht aus wie eine Gummiente";
   }

   @Override
   public String schwimmen() {
      return "Schwimmen: Treibt wie Gummi auf dem Wasser herum ...";
   }

}
