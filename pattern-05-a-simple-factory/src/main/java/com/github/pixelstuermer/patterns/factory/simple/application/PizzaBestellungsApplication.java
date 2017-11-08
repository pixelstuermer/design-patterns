package com.github.pixelstuermer.patterns.factory.simple.application;

import com.github.pixelstuermer.patterns.factory.simple.models.Pizza;
import com.github.pixelstuermer.patterns.factory.simple.models.Pizzeria;
import com.github.pixelstuermer.patterns.factory.simple.util.PizzaFactory;
import com.github.pixelstuermer.patterns.factory.simple.util.PizzaType;

public class PizzaBestellungsApplication {

   public static void main( String[] args ) {
      Pizzeria pizzeria = new Pizzeria( new PizzaFactory() );
      Pizza pizza1 = pizzeria.bestellePizza( PizzaType.HAWAII );
      Pizza pizza2 = pizzeria.bestellePizza( PizzaType.MARGHERITA );
      Pizza pizza3 = pizzeria.bestellePizza( PizzaType.SALAMI );
   }

}
