package com.github.pixelstuermer.patterns.fassade.fassade;

import com.github.pixelstuermer.patterns.fassade.model.DvdPlayer;
import com.github.pixelstuermer.patterns.fassade.model.LightSystem;
import com.github.pixelstuermer.patterns.fassade.model.PopcornMachine;
import com.github.pixelstuermer.patterns.fassade.model.Screen;

public class CinemaFacade {

   private PopcornMachine popcornMachine;
   private LightSystem lightSystem;
   private DvdPlayer dvdPlayer;
   private Screen screen;

   public CinemaFacade( PopcornMachine popcornMachine,
               LightSystem lightSystem,
               DvdPlayer dvdPlayer,
               Screen screen ) {
      this.popcornMachine = popcornMachine;
      this.lightSystem = lightSystem;
      this.dvdPlayer = dvdPlayer;
      this.screen = screen;
   }

   public void startMovie() {
      popcornMachine.on();
      popcornMachine.start();
      lightSystem.off();
      dvdPlayer.on();
      dvdPlayer.start();
      dvdPlayer.play();
      screen.down();
   }

   public void endMovie() {
      popcornMachine.off();
      lightSystem.on();
      dvdPlayer.stop();
      screen.up();
   }

}
