package com.github.pixelstuermer.patterns.command.model;

public class Television {

   public String name;

   public Television( String name ) {
      this.name = name;
   }

   public void turnOn() {
      System.out.println( "TV " + name + " was turned on" );
   }

   public void turnOff() {
      System.out.println( "TV " + name + " was turned off" );
   }

   public void setChannel() {
      System.out.println( "Channel of TV " + name + " was set" );
   }

   public void setVolume() {
      System.out.println( "Volume of TV " + name + " was set" );
   }

}
