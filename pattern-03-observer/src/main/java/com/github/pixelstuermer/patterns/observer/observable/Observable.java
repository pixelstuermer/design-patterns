package com.github.pixelstuermer.patterns.observer.observable;

import com.github.pixelstuermer.patterns.observer.observer.Observer;

public interface Observable {

   public void addObserver( Observer observer );

   public void removeObserver( Observer observer );

   public void notifyObservers();

}
