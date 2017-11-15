package com.github.pixelstuermer.patterns.command.model;

public class Light {

   public String name;

   public Light( String name ) {
      this.name = name;
   }

   public void turnOn() {
      System.out.println( "Light " + name + " was turned on" );
   }

   public void turnOff() {
      System.out.println( "Light " + name + " was turned off" );
   }

}
