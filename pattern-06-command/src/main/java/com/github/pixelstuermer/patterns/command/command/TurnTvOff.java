package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.Television;

public class TurnTvOff implements Command {

   Television television;

   public TurnTvOff( Television television ) {
      this.television = television;
   }

   @Override
   public void execute() {
      television.turnOff();
   }

   @Override
   public void revoke() {
      television.turnOn();
      television.setVolume();
      television.setChannel();
   }

}
