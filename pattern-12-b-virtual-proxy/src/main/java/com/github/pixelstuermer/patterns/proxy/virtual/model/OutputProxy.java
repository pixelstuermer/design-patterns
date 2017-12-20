package com.github.pixelstuermer.patterns.proxy.virtual.model;

public class OutputProxy implements Output {

   private String text;

   // virtual proxy fields
   private OutputSubject outputSubject;
   private Thread subjectThread;
   private boolean instantiationProgressStarted;

   public OutputProxy( String text ) {
      this.text = text;
      instantiationProgressStarted = false;
   }

   @Override
   public void printInfo() {
      if ( outputSubject != null ) {
         // actual subject has already been instantiated, so no proxy needed
         outputSubject.printInfo();
      }
      else if ( outputSubject == null ) {
         // actual subject has not been instantiated yet, so proxy needed
         System.out.println( "Output Proxy: " + text );
         if ( !instantiationProgressStarted ) {
            // instantiation not started yet
            instantiationProgressStarted = true;
            // run instantiation in other thread
            subjectThread = new Thread( new Runnable() {
               @Override
               public void run() {
                  outputSubject = new OutputSubject( text );
               }
            } );
            subjectThread.start();
         }
         else {
            // NOP because the actual subject is being instantiated right now
         }
      }
   }

}
