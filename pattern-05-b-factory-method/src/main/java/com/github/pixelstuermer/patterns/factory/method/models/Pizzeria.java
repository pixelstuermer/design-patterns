package com.github.pixelstuermer.patterns.factory.method.models;

import com.github.pixelstuermer.patterns.factory.method.util.PizzaType;

public abstract class Pizzeria {

   public Pizzeria() {
   }

   public Pizza bestellePizza( PizzaType pizzaType ) {
      Pizza pizza = erstellePizza( pizzaType );
      pizza.zubereiten();
      pizza.backen();
      pizza.schneiden();
      pizza.verpacken();
      return pizza;
   }

   public abstract Pizza erstellePizza( PizzaType pizzaType );

}
