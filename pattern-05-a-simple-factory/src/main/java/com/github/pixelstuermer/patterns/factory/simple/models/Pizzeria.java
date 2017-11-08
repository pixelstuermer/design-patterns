package com.github.pixelstuermer.patterns.factory.simple.models;

import com.github.pixelstuermer.patterns.factory.simple.util.PizzaFactory;
import com.github.pixelstuermer.patterns.factory.simple.util.PizzaType;

public class Pizzeria {

   private PizzaFactory pizzaFactory;

   public Pizzeria( PizzaFactory pizzaFactory ) {
      this.pizzaFactory = pizzaFactory;
   }

   public Pizza bestellePizza( PizzaType pizzaType ) {
      Pizza pizza = pizzaFactory.erstellePizza( pizzaType );
      pizza.zubereiten();
      pizza.backen();
      pizza.schneiden();
      pizza.verpacken();
      return pizza;
   }

}
