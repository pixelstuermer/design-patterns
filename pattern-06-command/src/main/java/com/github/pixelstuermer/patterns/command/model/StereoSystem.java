package com.github.pixelstuermer.patterns.command.model;

public class StereoSystem {

   public String name;

   public StereoSystem( String name ) {
      this.name = name;
   }

   public void turnOn() {
      System.out.println( "Stereo system " + name + " was turned on" );
   }

   public void turnOff() {
      System.out.println( "Stereo system " + name + " was turned off" );
   }

   public void setVolume() {
      System.out.println( "Volume of Stereo system " + name + " was set" );
   }

   public void setDVD() {
      System.out.println( "DVD of Stereo system " + name + " was set" );
   }

}
