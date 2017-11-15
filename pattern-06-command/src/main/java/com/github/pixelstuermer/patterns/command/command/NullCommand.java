package com.github.pixelstuermer.patterns.command.command;

public class NullCommand implements Command {

   @Override
   public void execute() {
      // null object
   }

   @Override
   public void revoke() {
      // null object
   }

}
