package com.github.pixelstuermer.patterns.iterator.application;

import com.github.pixelstuermer.patterns.iterator.model.Kellnerin;
import com.github.pixelstuermer.patterns.iterator.model.PfannkuchenhausSpeisekarte;
import com.github.pixelstuermer.patterns.iterator.model.RestaurantSpeisekarte;

public class RestaurantApplication {

   public static void main( String[] args ) {
      PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
      RestaurantSpeisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();

      Kellnerin kellnerin = new Kellnerin( pfannkuchenhausSpeisekarte, restaurantSpeisekarte );
      kellnerin.speisekarteAusgeben();
   }

}
