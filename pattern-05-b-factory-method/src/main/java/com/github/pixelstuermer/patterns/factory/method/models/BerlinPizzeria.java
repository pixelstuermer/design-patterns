package com.github.pixelstuermer.patterns.factory.method.models;

import com.github.pixelstuermer.patterns.factory.method.util.PizzaType;

public class BerlinPizzeria extends Pizzeria {

   @Override
   public Pizza erstellePizza( PizzaType pizzaType ) {
      Pizza pizza = null;
      if ( pizzaType.equals( PizzaType.SALAMI ) ) {
         pizza = new BerlinerSalamiPizza();
      }
      else if ( pizzaType.equals( PizzaType.HAWAII ) ) {
         pizza = new BerlinerHawaiiPizza();
      }
      return pizza;
   }

}
