package com.github.pixelstuermer.patterns.abstrakt.factory.model;

import com.github.pixelstuermer.patterns.abstrakt.factory.util.MuenchnerPizzaZutatenFabrik;
import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaType;
import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaZutatenFabrik;

public class MuenchenPizzeria extends Pizzeria {

   @Override
   public Pizza erstellePizza( PizzaType pizzaType ) {
      Pizza pizza = null;
      PizzaZutatenFabrik pizzaZutatenFabrik = new MuenchnerPizzaZutatenFabrik();
      if ( pizzaType.equals( PizzaType.SALAMI ) ) {
         pizza = new SalamiPizza( pizzaZutatenFabrik );
         pizza.name = "Salamipizza Muenchner Art";
      }
      else if ( pizzaType.equals( PizzaType.KRABBEN ) ) {
         pizza = new KrabbenPizza( pizzaZutatenFabrik );
         pizza.name = "Krabben Muenchner Art";
      }
      return pizza;
   }

}
