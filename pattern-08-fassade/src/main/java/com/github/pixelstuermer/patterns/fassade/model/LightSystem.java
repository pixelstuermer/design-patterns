package com.github.pixelstuermer.patterns.fassade.model;

public class LightSystem {

   public void on() {
      System.out.println( "Turned lights on" );
   }

   public void off() {
      System.out.println( "Turned lights off" );
   }

   public void dim() {
      System.out.println( "Dimmed lights" );
   }

}
