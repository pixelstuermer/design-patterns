package com.github.pixelstuermer.patterns.state.application;

import com.github.pixelstuermer.patterns.state.model.KaugummiAutomat;

public class KaugummiAutomatApplication {

   private static KaugummiAutomat kaugummiAutomat;

   public static void main( String[] args ) {
      kaugummiAutomat = new KaugummiAutomat( 5 );

      kaugummiAutomat.muenzeEinwerfen();
      kaugummiAutomat.griffDrehen();
   }

}
