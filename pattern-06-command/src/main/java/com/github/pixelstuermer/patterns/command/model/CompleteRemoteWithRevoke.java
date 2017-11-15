package com.github.pixelstuermer.patterns.command.model;

import java.util.ArrayList;
import java.util.List;

import com.github.pixelstuermer.patterns.command.command.Command;
import com.github.pixelstuermer.patterns.command.command.NullCommand;

public class CompleteRemoteWithRevoke {

   List<Command> commandListOn;
   List<Command> commandListOff;
   Command revokeCommand;

   public CompleteRemoteWithRevoke() {
      commandListOn = new ArrayList<>();
      commandListOff = new ArrayList<>();

      Command nullCommand = new NullCommand();

      // set null object commands as default to avoid null pointer excetion
      revokeCommand = nullCommand;
      for ( int i = 0; i < 10; i++ ) {
         commandListOn.add( nullCommand );
         commandListOff.add( nullCommand );
      }
   }

   public void setCommand( int slot, Command onCommand, Command offCommand ) {
      commandListOn.set( slot, onCommand );
      commandListOff.set( slot, offCommand );
   }

   public void pressOnButton( int slot ) {
      commandListOn.get( slot ).execute();
      revokeCommand = commandListOn.get( slot );
   }

   public void pressOffButton( int slot ) {
      commandListOff.get( slot ).execute();
      revokeCommand = commandListOff.get( slot );
   }

   public void pressRevokeButton() {
      revokeCommand.revoke();
   }

}
