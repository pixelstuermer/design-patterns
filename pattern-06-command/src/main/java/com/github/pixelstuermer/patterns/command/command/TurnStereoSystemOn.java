package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.StereoSystem;

public class TurnStereoSystemOn implements Command {

   StereoSystem stereoSystem;

   public TurnStereoSystemOn( StereoSystem stereoSystem ) {
      this.stereoSystem = stereoSystem;
   }

   @Override
   public void execute() {
      stereoSystem.turnOn();
      stereoSystem.setVolume();
      stereoSystem.setDVD();
   }

   @Override
   public void revoke() {
      stereoSystem.turnOff();
   }

}
