package com.github.pixelstuermer.patterns.abstrakt.factory.model;

import com.github.pixelstuermer.patterns.abstrakt.factory.util.BerlinerPizzaZutatenFabrik;
import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaType;
import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaZutatenFabrik;

public class BerlinPizzeria extends Pizzeria {

   @Override
   public Pizza erstellePizza( PizzaType pizzaType ) {
      Pizza pizza = null;
      PizzaZutatenFabrik pizzaZutatenFabrik = new BerlinerPizzaZutatenFabrik();
      if ( pizzaType.equals( PizzaType.SALAMI ) ) {
         pizza = new SalamiPizza( pizzaZutatenFabrik );
         pizza.name = "Salamipizza Berliner Art";
      }
      else if ( pizzaType.equals( PizzaType.KRABBEN ) ) {
         pizza = new KrabbenPizza( pizzaZutatenFabrik );
         pizza.name = "Krabben Berliner Art";
      }
      return pizza;
   }

}
