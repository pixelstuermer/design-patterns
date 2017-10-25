package com.github.pixelstuermer.patterns.decorator.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pixelstuermer.patterns.decorator.models.Espresso;
import com.github.pixelstuermer.patterns.decorator.models.Getraenk;
import com.github.pixelstuermer.patterns.decorator.models.Kaffee;
import com.github.pixelstuermer.patterns.decorator.models.Milchschaum;
import com.github.pixelstuermer.patterns.decorator.models.Schoko;

public class KassenzettelApplication {

   private static final Logger LOGGER = LoggerFactory.getLogger( KassenzettelApplication.class );

   public static void main( String[] args ) {
      // drink 1
      Getraenk drinkOne = new Espresso();
      drinkOne = new Milchschaum( drinkOne );
      LOGGER.info( "Drink 1: {} fuer {}", drinkOne.getBeschreibung(), drinkOne.getPreis() );

      // drink 2
      Getraenk drinkTwo = new Kaffee();
      drinkTwo = new Milchschaum( drinkTwo );
      drinkTwo = new Schoko( drinkTwo );
      LOGGER.info( "Drink 2: {} fuer {}", drinkTwo.getBeschreibung(), drinkTwo.getPreis() );
   }

}
