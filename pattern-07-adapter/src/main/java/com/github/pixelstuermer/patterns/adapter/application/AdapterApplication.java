package com.github.pixelstuermer.patterns.adapter.application;

import com.github.pixelstuermer.patterns.adapter.adapters.TruthahnAdapter;
import com.github.pixelstuermer.patterns.adapter.models.Ente;
import com.github.pixelstuermer.patterns.adapter.models.StockEnte;
import com.github.pixelstuermer.patterns.adapter.models.WilderTruthahn;

public class AdapterApplication {

   public static void main( String[] args ) {
      StockEnte ente = new StockEnte();

      WilderTruthahn truthahn = new WilderTruthahn();
      Ente truthahnAdapter = new TruthahnAdapter( truthahn );

      System.out.println( "Truthahn:" );
      truthahn.kollern();
      truthahn.fliegen();

      System.out.println( "Ente:" );
      testeEnte( ente );

      System.out.println( "TruthahnAdapter:" );
      testeEnte( truthahnAdapter );
   }

   private static void testeEnte( Ente ente ) {
      ente.quaken();
      ente.fliegen();
   }

}
