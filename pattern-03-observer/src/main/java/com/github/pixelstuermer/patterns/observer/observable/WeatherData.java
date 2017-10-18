package com.github.pixelstuermer.patterns.observer.observable;

import java.util.ArrayList;
import java.util.List;

import com.github.pixelstuermer.patterns.observer.observer.Observer;

public class WeatherData implements Observable {

   private List<Observer> observerList;

   private double temperature;
   private double humidity;
   private double pressure;

   public WeatherData() {
      observerList = new ArrayList<>();
   }

   @Override
   public void addObserver( Observer observer ) {
      observerList.add( observer );
   }

   @Override
   public void removeObserver( Observer observer ) {
      int index = observerList.indexOf( observer );
      if ( observerList.size() > 0 ) {
         observerList.remove( index );
      }
   }

   @Override
   public void notifyObservers() {
      for ( Observer observer : observerList ) {
         observer.update( temperature, humidity, pressure );
      }
   }

   public void dataChanged() {
      notifyObservers();
   }

   public void setData( double temperature, double humidity, double pressure ) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      dataChanged();
   }

}
