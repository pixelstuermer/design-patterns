package com.github.pixelstuermer.patterns.singleton.models;

public class SingletonOne {

   public int number;
   public String text;
   public boolean hidden;

   private static SingletonOne singletonOne;

   private SingletonOne() {
      number = 0;
      text = "";
      hidden = false;
   }

   public static SingletonOne getInstance() {
      if ( singletonOne == null ) {
         singletonOne = new SingletonOne();
      }
      return singletonOne;
   }

}
