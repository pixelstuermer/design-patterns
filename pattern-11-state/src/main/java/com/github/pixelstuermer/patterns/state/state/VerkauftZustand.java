package com.github.pixelstuermer.patterns.state.state;

import com.github.pixelstuermer.patterns.state.model.KaugummiAutomat;

public class VerkauftZustand implements Zustand {

   private KaugummiAutomat kaugummiAutomat;

   public VerkauftZustand( KaugummiAutomat kaugummiAutomat ) {
      this.kaugummiAutomat = kaugummiAutomat;
   }

   @Override
   public void muenzeEinwerfen() {
      System.out.println( "Bitte warten Sie, Sie erhalten gleich einen Kaugummi" );
   }

   @Override
   public void muenzeAuswerfen() {
      System.out.println( "Zu spät, Sie haben bereits am Griff gedreht" );
   }

   @Override
   public void griffDrehen() {
      System.out.println( "Sie haben den Griff bereits schon einmal gedreht" );
   }

   @Override
   public void kaugummiAusgeben() {
      if ( kaugummiAutomat.getAnzahl() != 0 ) {
         System.out.println( "Eine Kugel rollt aus dem Ausgabeschacht" );
         kaugummiAutomat.setAnzahl( kaugummiAutomat.getAnzahl() - 1 );
      }
      if ( kaugummiAutomat.getAnzahl() > 0 ) {
         System.out.println( "Es kann wieder eine Münze eingeworfen werden" );
         kaugummiAutomat.setZustand( kaugummiAutomat.getKeineMuenzeZustand() );
      }
      else {
         System.out.println( "Der Automat ist leer" );
         kaugummiAutomat.setZustand( kaugummiAutomat.getAusverkauftZustand() );
      }
   }

}
