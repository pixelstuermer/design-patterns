package com.github.pixelstuermer.patterns.adapter.adapter;

import com.github.pixelstuermer.patterns.adapter.model.Ente;
import com.github.pixelstuermer.patterns.adapter.model.Truthahn;

public class TruthahnAdapter implements Ente {

   private Truthahn truthahn;

   public TruthahnAdapter( Truthahn truthahn ) {
      this.truthahn = truthahn;
   }

   @Override
   public void quaken() {
      truthahn.kollern();
   }

   @Override
   public void fliegen() {
      truthahn.fliegen();
   }

}
