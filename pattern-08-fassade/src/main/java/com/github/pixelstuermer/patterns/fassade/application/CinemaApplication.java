package com.github.pixelstuermer.patterns.fassade.application;

import com.github.pixelstuermer.patterns.fassade.fassade.CinemaFacade;
import com.github.pixelstuermer.patterns.fassade.model.DvdPlayer;
import com.github.pixelstuermer.patterns.fassade.model.LightSystem;
import com.github.pixelstuermer.patterns.fassade.model.PopcornMachine;
import com.github.pixelstuermer.patterns.fassade.model.Screen;

public class CinemaApplication {

   public static void main( String[] args ) {
      DvdPlayer dvdPlayer = new DvdPlayer();
      LightSystem lightSystem = new LightSystem();
      PopcornMachine popcornMachine = new PopcornMachine();
      Screen screen = new Screen();

      CinemaFacade cinemaFacade = new CinemaFacade( popcornMachine, lightSystem, dvdPlayer, screen );
      cinemaFacade.startMovie();
      System.out.println( "------------------------------" );
      lightSystem.dim();
      System.out.println( "------------------------------" );
      cinemaFacade.endMovie();
   }

}
