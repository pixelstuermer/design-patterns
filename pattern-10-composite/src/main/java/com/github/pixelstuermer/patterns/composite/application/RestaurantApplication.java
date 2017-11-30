package com.github.pixelstuermer.patterns.composite.application;

import com.github.pixelstuermer.patterns.composite.composite.SpeisekartenComponent;
import com.github.pixelstuermer.patterns.composite.model.Kellnerin;
import com.github.pixelstuermer.patterns.composite.model.Speise;
import com.github.pixelstuermer.patterns.composite.model.Speisekarte;

public class RestaurantApplication {

   public static void main( String[] args ) {
      SpeisekartenComponent pfannkuchenhausSpeisekarte = new Speisekarte( "PFANNKUCHEN" );
      SpeisekartenComponent restaurantSpeisekarte = new Speisekarte( "RESTAURANT" );
      SpeisekartenComponent cafeSpeisekarte = new Speisekarte( "CAFE" );
      SpeisekartenComponent dessertSeisekarte = new Speisekarte( "DESSERT" );

      // create tree
      SpeisekartenComponent allSeisekarten = new Speisekarte( "ALLE SPEISEKARTEN" );
      allSeisekarten.add( pfannkuchenhausSpeisekarte );
      allSeisekarten.add( restaurantSpeisekarte );
      allSeisekarten.add( cafeSpeisekarte );
      restaurantSpeisekarte.add( dessertSeisekarte );

      // create speisen
      pfannkuchenhausSpeisekarte.add( new Speise( "Blaubeer-Pfannkuchen", 6.99 ) );
      pfannkuchenhausSpeisekarte.add( new Speise( "Pfannkuchen", 3.99 ) );

      restaurantSpeisekarte.add( new Speise( "HotDog", 3.99 ) );
      restaurantSpeisekarte.add( new Speise( "Sandwhich", 5.99 ) );

      cafeSpeisekarte.add( new Speise( "Cafe", 2.99 ) );
      cafeSpeisekarte.add( new Speise( "Espresso", 1.99 ) );

      dessertSeisekarte.add( new Speise( "Kuchen", 3.99 ) );
      dessertSeisekarte.add( new Speise( "Eis", 5.99 ) );

      // Kellnerin
      Kellnerin kellnerin = new Kellnerin( allSeisekarten );
      kellnerin.speisekarteAusgeben();
   }

}
