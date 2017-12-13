package com.github.pixelstuermer.patterns.state.model;

import com.github.pixelstuermer.patterns.state.state.AusverkauftZustand;
import com.github.pixelstuermer.patterns.state.state.HatMuenzeZustand;
import com.github.pixelstuermer.patterns.state.state.KeineMuenzeZustand;
import com.github.pixelstuermer.patterns.state.state.VerkauftZustand;
import com.github.pixelstuermer.patterns.state.state.Zustand;

public class KaugummiAutomat {

   private Zustand keineMuenzeZustand;
   private Zustand hatMuenzeZustand;
   private Zustand verkauftZustand;
   private Zustand ausverkauftZustand;

   private Zustand zustand;
   int anzahl;

   public KaugummiAutomat( int anzahl ) {
      keineMuenzeZustand = new KeineMuenzeZustand( this );
      hatMuenzeZustand = new HatMuenzeZustand( this );
      verkauftZustand = new VerkauftZustand( this );
      ausverkauftZustand = new AusverkauftZustand( this );

      this.anzahl = anzahl;

      if ( this.anzahl > 0 ) {
         zustand = keineMuenzeZustand;
      }
      else {
         zustand = ausverkauftZustand;
      }
   }

   public void muenzeEinwerfen() {
      zustand.muenzeEinwerfen();
   }

   public void muenzeAuswerfen() {
      zustand.muenzeAuswerfen();
   }

   public void griffDrehen() {
      zustand.griffDrehen();
      zustand.kaugummiAusgeben();
   }

   public void setZustand( Zustand zustand ) {
      this.zustand = zustand;
   }

   public int getAnzahl() {
      return anzahl;
   }

   public void setAnzahl( int anzahl ) {
      this.anzahl = anzahl;
   }

   public Zustand getKeineMuenzeZustand() {
      return keineMuenzeZustand;
   }

   public Zustand getHatMuenzeZustand() {
      return hatMuenzeZustand;
   }

   public Zustand getVerkauftZustand() {
      return verkauftZustand;
   }

   public Zustand getAusverkauftZustand() {
      return ausverkauftZustand;
   }

}
