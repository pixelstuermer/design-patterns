package com.github.pixelstuermer.patterns.command.application;

import java.util.ArrayList;
import java.util.List;

import com.github.pixelstuermer.patterns.command.command.Command;
import com.github.pixelstuermer.patterns.command.command.MacroCommand;
import com.github.pixelstuermer.patterns.command.command.TurnLightOff;
import com.github.pixelstuermer.patterns.command.command.TurnLightOn;
import com.github.pixelstuermer.patterns.command.command.TurnStereoSystemOff;
import com.github.pixelstuermer.patterns.command.command.TurnStereoSystemOn;
import com.github.pixelstuermer.patterns.command.command.TurnTvOff;
import com.github.pixelstuermer.patterns.command.command.TurnTvOn;
import com.github.pixelstuermer.patterns.command.model.CompleteRemote;
import com.github.pixelstuermer.patterns.command.model.CompleteRemoteWithRevoke;
import com.github.pixelstuermer.patterns.command.model.Light;
import com.github.pixelstuermer.patterns.command.model.SimpleRemote;
import com.github.pixelstuermer.patterns.command.model.StereoSystem;
import com.github.pixelstuermer.patterns.command.model.Television;

public class RemoteApplication {

   public static void main( String[] args ) {
      System.out.println( ">>> Simple Remote <<<" );
      handleSimpleRemote();

      System.out.println();

      System.out.println( ">>> Complete Remote <<<" );
      handleCompleteRemote();

      System.out.println();

      System.out.println( ">>> Complete Remote with Revoke <<<" );
      handleCompleteRemoteWithRevoke();

      System.out.println();

      System.out.println( ">>> Complete Remote with Revoke in Party Mode <<<" );
      handleCompleteRemoteWithRevokeInPartyMode();
   }

   private static void handleSimpleRemote() {
      SimpleRemote simpleRemote = new SimpleRemote();

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

   private static void handleCompleteRemote() {
      CompleteRemote completeRemote = new CompleteRemote();

      Light bedroomLight = new Light( "bedroom" );
      Light livingRoomLight = new Light( "living room" );
      Television television = new Television( "bedroom" );
      StereoSystem stereoSystem = new StereoSystem( "basement" );

      TurnLightOn turnLightOnBedroom = new TurnLightOn( bedroomLight );
      TurnLightOff turnLightOffBedroom = new TurnLightOff( bedroomLight );

      TurnLightOn turnLightOnLivingRoom = new TurnLightOn( livingRoomLight );
      TurnLightOff turnLightOffLivingRoom = new TurnLightOff( livingRoomLight );

      TurnTvOn turnTvOnBedroom = new TurnTvOn( television );
      TurnTvOff turnTvOffedroom = new TurnTvOff( television );

      TurnStereoSystemOn turnStereoSystemOnBasement = new TurnStereoSystemOn( stereoSystem );
      TurnStereoSystemOff turnStereoSystemOffBasement = new TurnStereoSystemOff( stereoSystem );

      completeRemote.setCommand( 0, turnLightOnBedroom, turnLightOffBedroom );
      completeRemote.setCommand( 1, turnLightOnLivingRoom, turnLightOffLivingRoom );
      completeRemote.setCommand( 2, turnTvOnBedroom, turnTvOffedroom );
      completeRemote.setCommand( 3, turnStereoSystemOnBasement, turnStereoSystemOffBasement );

      completeRemote.pressOnButton( 0 );
      completeRemote.pressOffButton( 0 );

      System.out.println();

      completeRemote.pressOnButton( 1 );
      completeRemote.pressOffButton( 1 );

      System.out.println();

      completeRemote.pressOnButton( 2 );
      completeRemote.pressOffButton( 2 );

      System.out.println();

      completeRemote.pressOnButton( 3 );
      completeRemote.pressOffButton( 3 );

      System.out.println();

      completeRemote.pressOnButton( 4 );
      completeRemote.pressOffButton( 4 );
   }

   private static void handleCompleteRemoteWithRevoke() {
      CompleteRemoteWithRevoke completeRemoteWithRevoke = new CompleteRemoteWithRevoke();

      Light bedroomLight = new Light( "bedroom" );
      Light livingRoomLight = new Light( "living room" );

      TurnLightOn turnLightOnBedroom = new TurnLightOn( bedroomLight );
      TurnLightOff turnLightOffBedroom = new TurnLightOff( bedroomLight );

      TurnLightOn turnLightOnLivingRoom = new TurnLightOn( livingRoomLight );
      TurnLightOff turnLightOffLivingRoom = new TurnLightOff( livingRoomLight );

      completeRemoteWithRevoke.setCommand( 0, turnLightOnBedroom, turnLightOffBedroom );
      completeRemoteWithRevoke.setCommand( 1, turnLightOnLivingRoom, turnLightOffLivingRoom );

      completeRemoteWithRevoke.pressOnButton( 0 );
      completeRemoteWithRevoke.pressRevokeButton();

      System.out.println();

      completeRemoteWithRevoke.pressOffButton( 0 );
      completeRemoteWithRevoke.pressRevokeButton();

      System.out.println();

      completeRemoteWithRevoke.pressOnButton( 1 );
      completeRemoteWithRevoke.pressRevokeButton();

      System.out.println();

      completeRemoteWithRevoke.pressOffButton( 1 );
      completeRemoteWithRevoke.pressRevokeButton();
   }

   private static void handleCompleteRemoteWithRevokeInPartyMode() {
      Light light = new Light( "living room" );
      TurnLightOn turnLightOnCommand = new TurnLightOn( light );
      TurnLightOff turnLightOffCommand = new TurnLightOff( light );

      Television television = new Television( "bedroom" );
      TurnTvOn turnTvOnCommand = new TurnTvOn( television );
      TurnTvOff turnTvOffCommand = new TurnTvOff( television );

      StereoSystem stereoSystem = new StereoSystem( "garden" );
      TurnStereoSystemOn turnStereoSystemOnCommand = new TurnStereoSystemOn( stereoSystem );
      TurnStereoSystemOff turnStereoSystemOffCommand = new TurnStereoSystemOff( stereoSystem );

      List<Command> commandsListOn = new ArrayList<>();
      commandsListOn.add( turnStereoSystemOnCommand );
      commandsListOn.add( turnTvOnCommand );
      commandsListOn.add( turnLightOnCommand );

      List<Command> commandsListOff = new ArrayList<>();
      commandsListOff.add( turnStereoSystemOffCommand );
      commandsListOff.add( turnTvOffCommand );
      commandsListOff.add( turnLightOffCommand );

      MacroCommand partyModeOnMacroCommand = new MacroCommand( commandsListOn );
      MacroCommand partyModeOffMacroCommand = new MacroCommand( commandsListOff );

      CompleteRemoteWithRevoke completeRemoteWithRevoke = new CompleteRemoteWithRevoke();
      completeRemoteWithRevoke.setCommand( 0, partyModeOnMacroCommand, partyModeOffMacroCommand );

      completeRemoteWithRevoke.pressOnButton( 0 );

      System.out.println();

      completeRemoteWithRevoke.pressOffButton( 0 );

      System.out.println();

      completeRemoteWithRevoke.pressRevokeButton();
   }

}
