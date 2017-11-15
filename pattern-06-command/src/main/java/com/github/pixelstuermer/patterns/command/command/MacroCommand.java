package com.github.pixelstuermer.patterns.command.command;

import java.util.List;

public class MacroCommand implements Command {

   List<Command> commandsList;

   public MacroCommand( List<Command> commandsList ) {
      this.commandsList = commandsList;
   }

   @Override
   public void execute() {
      for ( Command command : commandsList ) {
         command.execute();
      }
   }

   @Override
   public void revoke() {
      for ( int i = commandsList.size() - 1; i >= 0; i-- ) {
         commandsList.get( i ).revoke();
      }
   }

}
