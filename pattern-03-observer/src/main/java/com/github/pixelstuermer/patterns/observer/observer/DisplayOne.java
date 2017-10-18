package com.github.pixelstuermer.patterns.observer.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pixelstuermer.patterns.observer.observable.Observable;

public class DisplayOne implements Observer {

   private static final Logger LOGGER = LoggerFactory.getLogger( DisplayOne.class );

   private Observable weatherData;

   private double temperature;
   private double humidity;
   private double pressure;

   public DisplayOne( Observable weatherData ) {
      this.weatherData = weatherData;
      this.weatherData.addObserver( this );
   }

   @Override
   public void update( double temperature, double humidity, double pressure ) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      printNewData();
   }

   public void printNewData() {
      LOGGER.info( "Temp.: {}, Hum.: {}, Pres.: {}",
         temperature, humidity, pressure );
   }

}
