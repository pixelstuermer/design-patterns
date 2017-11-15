package com.github.pixelstuermer.patterns.command.application;

import com.github.pixelstuermer.patterns.command.command.TurnLightOn;
import com.github.pixelstuermer.patterns.command.command.TurnStereoSystemOn;
import com.github.pixelstuermer.patterns.command.command.TurnTvOn;
import com.github.pixelstuermer.patterns.command.model.Light;
import com.github.pixelstuermer.patterns.command.model.SimpleRemote;
import com.github.pixelstuermer.patterns.command.model.StereoSystem;
import com.github.pixelstuermer.patterns.command.model.Television;

public class RemoteApplication {

   public static void main( String[] args ) {
      System.out.println( ">>> Simple Remote <<<" );
      handleSimpleRemote();
      System.out.println();
   }

   private static void handleSimpleRemote() {
      SimpleRemote simpleRemote = new SimpleRemote();

      System.out.println();

      Light light = new Light( "living room" );
      TurnLightOn turnLightOnCommand = new TurnLightOn( light );
      simpleRemote.setCommand( turnLightOnCommand );
      simpleRemote.pressButton();

      System.out.println();

      Television television = new Television( "bedroom" );
      TurnTvOn turnTvOnCommand = new TurnTvOn( television );
      simpleRemote.setCommand( turnTvOnCommand );
      simpleRemote.pressButton();

      System.out.println();

      StereoSystem stereoSystem = new StereoSystem( "garden" );
      TurnStereoSystemOn turnStereoSystemOnCommand = new TurnStereoSystemOn( stereoSystem );
      simpleRemote.setCommand( turnStereoSystemOnCommand );
      simpleRemote.pressButton();
   }

}
