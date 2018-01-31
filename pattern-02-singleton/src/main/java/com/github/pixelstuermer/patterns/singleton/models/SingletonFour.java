package com.github.pixelstuermer.patterns.singleton.models;

public class SingletonFour {

   public int number;
   public String text;
   public boolean hidden;

   private static SingletonFour singletonFour;

   private SingletonFour() {
      number = 0;
      text = "";
      hidden = false;
   }

   public static SingletonFour getInstance() {
      if ( singletonFour == null ) {
         synchronized ( SingletonFour.class ) {
            if ( singletonFour == null ) {
               singletonFour = new SingletonFour();
            }
         }
      }
      return singletonFour;
   }

}
