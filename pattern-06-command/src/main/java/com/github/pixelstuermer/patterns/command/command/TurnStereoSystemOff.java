package com.github.pixelstuermer.patterns.command.command;

import com.github.pixelstuermer.patterns.command.model.StereoSystem;

public class TurnStereoSystemOff implements Command {

   StereoSystem stereoSystem;

   public TurnStereoSystemOff( StereoSystem stereoSystem ) {
      this.stereoSystem = stereoSystem;
   }

   @Override
   public void execute() {
      stereoSystem.turnOff();
   }

   @Override
   public void revoke() {
      stereoSystem.turnOn();
      stereoSystem.setVolume();
      stereoSystem.setDVD();
   }

}
