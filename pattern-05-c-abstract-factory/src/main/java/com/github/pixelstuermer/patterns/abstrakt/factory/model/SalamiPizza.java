package com.github.pixelstuermer.patterns.abstrakt.factory.model;

import com.github.pixelstuermer.patterns.abstrakt.factory.util.PizzaZutatenFabrik;

public class SalamiPizza extends Pizza {

   PizzaZutatenFabrik pizzaZutatenFabrik;

   public SalamiPizza( PizzaZutatenFabrik pizzaZutatenFabrik ) {
      super();
      this.pizzaZutatenFabrik = pizzaZutatenFabrik;
   }

   @Override
   public void vorbereiten() {
      System.out.println( "Mache " + name );
      teig = pizzaZutatenFabrik.erstelleTeig();
      sosse = pizzaZutatenFabrik.erstelleSosse();
   }

}
