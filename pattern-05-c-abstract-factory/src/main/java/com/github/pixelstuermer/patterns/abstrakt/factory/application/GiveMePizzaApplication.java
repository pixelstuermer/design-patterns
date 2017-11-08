package com.github.pixelstuermer.patterns.abstrakt.factory.application;

import com.github.pixelstuermer.patterns.abstrakt.factory.model.BerlinPizzeria;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Pizza;
import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaType;

public class GiveMePizzaApplication {

   public static void main( String[] args ) {
      BerlinPizzeria berlinerPizzeria = new BerlinPizzeria();
      Pizza pizza = berlinerPizzeria.bestellePizza( PizzaType.KRABBEN );
   }

}
