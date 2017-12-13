package com.github.pixelstuermer.patterns.state.state;

import com.github.pixelstuermer.patterns.state.model.KaugummiAutomat;

public class HatMuenzeZustand implements Zustand {

   private KaugummiAutomat kaugummiAutomat;

   public HatMuenzeZustand( KaugummiAutomat kaugummiAutomat ) {
      this.kaugummiAutomat = kaugummiAutomat;
   }

   @Override
   public void muenzeEinwerfen() {
      System.out.println( "Es wurde bereits eine Münze eingeworfen" );
   }

   @Override
   public void muenzeAuswerfen() {
      System.out.println( "Münze wird ausgeworfen" );
      kaugummiAutomat.setZustand( kaugummiAutomat.getKeineMuenzeZustand() );
   }

   @Override
   public void griffDrehen() {
      System.out.println( "Sie haben den Griff gedreht" );
      kaugummiAutomat.setZustand( kaugummiAutomat.getVerkauftZustand() );
   }

   @Override
   public void kaugummiAusgeben() {
      System.out.println( "Es wird kein Kaugummi ausgegeben" );
   }

}
