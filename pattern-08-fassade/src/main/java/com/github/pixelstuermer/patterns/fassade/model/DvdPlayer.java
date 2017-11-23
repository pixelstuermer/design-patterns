package com.github.pixelstuermer.patterns.fassade.model;

public class DvdPlayer {

   public void on() {
      System.out.println( "Turned DVD player on" );
   }

   public void off() {
      System.out.println( "Turned DVD player off" );
   }

   public void start() {
      System.out.println( "Started DVD player" );
   }

   public void stop() {
      System.out.println( "stopped DVD player" );
   }

   public void play() {
      System.out.println( "Started to play the DVD" );
   }

}
