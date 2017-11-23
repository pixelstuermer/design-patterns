package com.github.pixelstuermer.patterns.adapter.adapters;

import com.github.pixelstuermer.patterns.adapter.models.Ente;
import com.github.pixelstuermer.patterns.adapter.models.Truthahn;

public class TruthahnAdapter implements Ente {

   Truthahn truthahn;

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
