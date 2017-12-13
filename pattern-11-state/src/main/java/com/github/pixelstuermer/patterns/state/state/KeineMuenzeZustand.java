package com.github.pixelstuermer.patterns.state.state;

import com.github.pixelstuermer.patterns.state.model.KaugummiAutomat;

public class KeineMuenzeZustand implements Zustand {

   private KaugummiAutomat kaugummiAutomat;

   public KeineMuenzeZustand( KaugummiAutomat kaugummiAutomat ) {
      this.kaugummiAutomat = kaugummiAutomat;
   }

   @Override
   public void muenzeEinwerfen() {
      System.out.println( "Sie haben eine Münze eingeworfen" );
      kaugummiAutomat.setZustand( kaugummiAutomat.getHatMuenzeZustand() );
   }

   @Override
   public void muenzeAuswerfen() {
      System.out.println( "Sie haben keine Münze eingeworfen" );
   }

   @Override
   public void griffDrehen() {
      System.out.println( "Sie haben gedreht, aber es war keine Münze eingeworfen" );
   }

   @Override
   public void kaugummiAusgeben() {
      System.out.println( "Sie müssen erst eine Münze einwerfen" );
   }

}
