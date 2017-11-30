package com.github.pixelstuermer.patterns.composite.model;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;

public class Kellnerin {

   private SpeisekartenComponent allSpeisen;

   public Kellnerin( SpeisekartenComponent allSpeisen ) {
      this.allSpeisen = allSpeisen;
   }

   public void speisekarteAusgeben() {
      allSpeisen.ausgeben();
   }

}
