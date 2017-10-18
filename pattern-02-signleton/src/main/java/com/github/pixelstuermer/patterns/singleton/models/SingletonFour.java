package com.github.pixelstuermer.patterns.singleton.models;

public class SingletonFour {

   public int number;
   public String text;
   public boolean hidden;

   private static SingletonFour singletonFour = new SingletonFour();

   private SingletonFour() {
      number = 0;
      text = "";
      hidden = false;
   }

   public static SingletonFour getInstance() {
      return singletonFour;
   }

}
