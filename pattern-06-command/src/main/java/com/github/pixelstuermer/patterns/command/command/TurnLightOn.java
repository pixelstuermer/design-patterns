package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.Light;

public class TurnLightOn implements Command {

   Light light;

   public TurnLightOn( Light light ) {
      this.light = light;
   }

   @Override
   public void execute() {
      light.turnOn();
   }

   @Override
   public void revoke() {
      light.turnOff();
   }

}
