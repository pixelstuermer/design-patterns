package com.github.pixelstuermer.patterns.strategy.application;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtMitRaketenAntrieb;
import com.github.pixelstuermer.patterns.strategy.models.Ente;
import com.github.pixelstuermer.patterns.strategy.models.GummiEnte;
import com.github.pixelstuermer.patterns.strategy.models.LockEnte;
import com.github.pixelstuermer.patterns.strategy.models.MoorEnte;
import com.github.pixelstuermer.patterns.strategy.models.StockEnte;

public class Application {

   private static Ente ente;
   private static final String NEWLINE = System.lineSeparator();
   private static final String DASHES = NEWLINE + "-----" + NEWLINE;

   public static void main( String[] args ) {
      ente = new StockEnte();
      System.out.println( ente.anzeigen() );
      System.out.println( ente.schwimmen() );
      System.out.println( ente.tuFliegen() );
      System.out.println( ente.tuQuaken() );

      System.out.println( DASHES );

      ente = new GummiEnte();
      System.out.println( ente.anzeigen() );
      System.out.println( ente.schwimmen() );
      System.out.println( ente.tuFliegen() );
      System.out.println( ente.tuQuaken() );

      System.out.println( DASHES );

      ente = new MoorEnte();
      System.out.println( ente.anzeigen() );
      System.out.println( ente.schwimmen() );
      System.out.println( ente.tuFliegen() );
      System.out.println( ente.tuQuaken() );

      System.out.println( DASHES );

      ente = new LockEnte();
      System.out.println( ente.anzeigen() );
      System.out.println( ente.schwimmen() );
      System.out.println( ente.tuFliegen() );
      System.out.println( ente.tuQuaken() );

      System.out.println( DASHES );

      ente = new GummiEnte();
      // put magic to the rubber duck
      ente.setFlugVerhalten( new FliegtMitRaketenAntrieb() );
      System.out.println( ente.tuFliegen() );
   }

}
