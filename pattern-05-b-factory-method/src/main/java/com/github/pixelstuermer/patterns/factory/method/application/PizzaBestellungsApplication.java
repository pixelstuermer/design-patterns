package com.github.pixelstuermer.patterns.factory.method.application;

import com.github.pixelstuermer.patterns.factory.method.models.BerlinPizzeria;
import com.github.pixelstuermer.patterns.factory.method.models.MuenchenPizzeria;
import com.github.pixelstuermer.patterns.factory.method.models.Pizzeria;
import com.github.pixelstuermer.patterns.factory.method.util.PizzaType;

public class PizzaBestellungsApplication {

   public static void main( String[] args ) {
      Pizzeria berlinPizzeria = new BerlinPizzeria();
      berlinPizzeria.bestellePizza( PizzaType.HAWAII );
      berlinPizzeria.bestellePizza( PizzaType.SALAMI );

      Pizzeria muenchenPizzeria = new MuenchenPizzeria();
      muenchenPizzeria.bestellePizza( PizzaType.HAWAII );
      muenchenPizzeria.bestellePizza( PizzaType.SALAMI );
   }

}
