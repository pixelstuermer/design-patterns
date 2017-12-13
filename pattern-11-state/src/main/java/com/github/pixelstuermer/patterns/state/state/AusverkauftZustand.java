package com.github.pixelstuermer.patterns.state.state;

import com.github.pixelstuermer.patterns.state.model.KaugummiAutomat;

public class AusverkauftZustand implements Zustand {

   private KaugummiAutomat kaugummiAutomat;

   public AusverkauftZustand( KaugummiAutomat kaugummiAutomat ) {
      this.kaugummiAutomat = kaugummiAutomat;
   }

   @Override
   public void muenzeEinwerfen() {
   }

   @Override
   public void muenzeAuswerfen() {
   }

   @Override
   public void griffDrehen() {
   }

   @Override
   public void kaugummiAusgeben() {
   }

}
