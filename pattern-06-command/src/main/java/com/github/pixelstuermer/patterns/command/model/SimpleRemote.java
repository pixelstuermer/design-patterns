package com.github.pixelstuermer.patterns.command.model;

import com.github.pixelstuermer.patterns.command.command.Command;

public class SimpleRemote {

   Command command;

   public SimpleRemote() {
      // nothing to do here, easy ;-)
   }

   public void setCommand( Command command ) {
      this.command = command;
   }

   public void pressButton() {
      command.execute();
   }

}
