package com.github.pixelstuermer.patterns.singleton.models;

public class SingletonTwo {

   public int number;
   public String text;
   public boolean hidden;

   private static SingletonTwo singletonTwo;

   private SingletonTwo() {
      number = 0;
      text = "";
      hidden = false;
   }

   public static synchronized SingletonTwo getInstance() {
      if ( singletonTwo == null ) {
         singletonTwo = new SingletonTwo();
      }
      return singletonTwo;
   }

}
