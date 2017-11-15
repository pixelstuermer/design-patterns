package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.Television;

public class TurnTvOn implements Command {

   Television television;

   public TurnTvOn( Television television ) {
      this.television = television;
   }

   @Override
   public void execute() {
      television.turnOn();
      television.setVolume();
      television.setChannel();
   }

   @Override
   public void revoke() {
      television.turnOff();
   }

}
