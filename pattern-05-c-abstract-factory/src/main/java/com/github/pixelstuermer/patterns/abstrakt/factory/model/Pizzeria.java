package com.github.pixelstuermer.patterns.abstrakt.factory.model;

import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaType;

public abstract class Pizzeria {

   public Pizzeria() {
   }

   public Pizza bestellePizza( PizzaType pizzaType ) {
      Pizza pizza = erstellePizza( pizzaType );
      pizza.vorbereiten();
      pizza.backen();
      pizza.schneiden();
      pizza.verpacken();
      return pizza;
   }

   public abstract Pizza erstellePizza( PizzaType pizzaType );

}
