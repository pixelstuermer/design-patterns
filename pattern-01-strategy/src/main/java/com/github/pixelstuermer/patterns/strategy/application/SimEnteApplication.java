package com.github.pixelstuermer.patterns.strategy.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pixelstuermer.patterns.strategy.interfaces.FliegtMitRaketenAntrieb;
import com.github.pixelstuermer.patterns.strategy.models.Ente;
import com.github.pixelstuermer.patterns.strategy.models.GummiEnte;
import com.github.pixelstuermer.patterns.strategy.models.LockEnte;
import com.github.pixelstuermer.patterns.strategy.models.MoorEnte;
import com.github.pixelstuermer.patterns.strategy.models.StockEnte;

public class SimEnteApplication {

   private static Ente ente;
   private static final String DASHES = "-----";

   private static final Logger LOGGER = LoggerFactory.getLogger( SimEnteApplication.class );

   public static void main( String[] args ) {
      ente = new StockEnte();
      LOGGER.info( ente.anzeigen() );
      LOGGER.info( ente.schwimmen() );
      LOGGER.info( ente.tuFliegen() );
      LOGGER.info( ente.tuQuaken() );

      LOGGER.info( DASHES );

      ente = new GummiEnte();
      LOGGER.info( ente.anzeigen() );
      LOGGER.info( ente.schwimmen() );
      LOGGER.info( ente.tuFliegen() );
      LOGGER.info( ente.tuQuaken() );

      LOGGER.info( DASHES );

      ente = new MoorEnte();
      LOGGER.info( ente.anzeigen() );
      LOGGER.info( ente.schwimmen() );
      LOGGER.info( ente.tuFliegen() );
      LOGGER.info( ente.tuQuaken() );

      LOGGER.info( DASHES );

      ente = new LockEnte();
      LOGGER.info( ente.anzeigen() );
      LOGGER.info( ente.schwimmen() );
      LOGGER.info( ente.tuFliegen() );
      LOGGER.info( ente.tuQuaken() );

      LOGGER.info( DASHES );

      ente = new GummiEnte();
      // put magic to the rubber duck
      ente.setFlugVerhalten( new FliegtMitRaketenAntrieb() );
      LOGGER.info( ente.tuFliegen() );
   }

}
