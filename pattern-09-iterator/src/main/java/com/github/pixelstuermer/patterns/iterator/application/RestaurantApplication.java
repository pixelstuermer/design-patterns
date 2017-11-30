package com.github.pixelstuermer.patterns.iterator.application;

import com.github.pixelstuermer.patterns.iterator.model.CafeSpeisekarte;
import com.github.pixelstuermer.patterns.iterator.model.Kellnerin;
import com.github.pixelstuermer.patterns.iterator.model.PfannkuchenhausSpeisekarte;
import com.github.pixelstuermer.patterns.iterator.model.RestaurantSpeisekarte;
import com.github.pixelstuermer.patterns.iterator.model.Speisekarte;

public class RestaurantApplication {

   public static void main( String[] args ) {
      Speisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
      Speisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();
      Speisekarte cafeSpeisekarte = new CafeSpeisekarte();

      Kellnerin kellnerin = new Kellnerin( pfannkuchenhausSpeisekarte, restaurantSpeisekarte, cafeSpeisekarte );
      kellnerin.speisekarteAusgeben();
   }

}
