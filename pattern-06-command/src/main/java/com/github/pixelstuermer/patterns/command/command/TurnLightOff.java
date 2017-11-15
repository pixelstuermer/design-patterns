package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.Light;

public class TurnLightOff implements Command {

   Light light;

   public TurnLightOff( Light light ) {
      this.light = light;
   }

   @Override
   public void execute() {
      light.turnOff();
   }

   @Override
   public void revoke() {
      light.turnOn();
   }

}
