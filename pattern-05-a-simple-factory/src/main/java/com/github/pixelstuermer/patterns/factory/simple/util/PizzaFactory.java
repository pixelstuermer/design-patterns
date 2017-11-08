package com.github.pixelstuermer.patterns.factory.simple.util;

import com.github.pixelstuermer.patterns.factory.simple.models.HawaiiPizza;
import com.github.pixelstuermer.patterns.factory.simple.models.MargheritaPizza;
import com.github.pixelstuermer.patterns.factory.simple.models.Pizza;
import com.github.pixelstuermer.patterns.factory.simple.models.SalamiPizza;

public class PizzaFactory {

   public Pizza erstellePizza( PizzaType pizzaType ) {
      Pizza pizza = null;
      if ( pizzaType.equals( PizzaType.MARGHERITA ) ) {
         pizza = new MargheritaPizza();
      }
      else if ( pizzaType.equals( PizzaType.SALAMI ) ) {
         pizza = new SalamiPizza();
      }
      else if ( pizzaType.equals( PizzaType.HAWAII ) ) {
         pizza = new HawaiiPizza();
      }
      return pizza;
   }

}
