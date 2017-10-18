package com.github.pixelstuermer.patterns.singleton.models;

public class SingletonThree {

   public int number;
   public String text;
   public boolean hidden;

   private static SingletonThree singletonThree = new SingletonThree();

   private SingletonThree() {
      number = 0;
      text = "";
      hidden = false;
   }

   public static SingletonThree getInstance() {
      return singletonThree;
   }

}
