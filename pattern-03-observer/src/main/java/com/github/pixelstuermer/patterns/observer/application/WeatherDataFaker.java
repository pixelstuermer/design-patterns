package com.github.pixelstuermer.patterns.observer.application;

import com.github.pixelstuermer.patterns.observer.observable.WeatherData;
import com.github.pixelstuermer.patterns.observer.observer.DisplayOne;
import com.github.pixelstuermer.patterns.observer.observer.DisplayTwo;
import com.github.pixelstuermer.patterns.observer.observer.Observer;

public class WeatherDataFaker {

   public static void main( String[] args ) {
      WeatherData weatherData = new WeatherData();

      Observer displayOne = new DisplayOne( weatherData );
      Observer displayTwo = new DisplayTwo( weatherData );

      weatherData.setData( 22, 33, 44 );
      weatherData.setData( 123, 456, 789 );
      weatherData.setData( 0.1, 1.2, 3.4 );
   }

}
