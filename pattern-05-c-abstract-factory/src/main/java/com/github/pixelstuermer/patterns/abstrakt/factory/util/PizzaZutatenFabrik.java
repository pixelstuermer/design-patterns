package com.github.pixelstuermer.patterns.abstrakt.factory.util;

import com.github.pixelstuermer.patterns.abstrakt.factory.model.Krabben;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Sosse;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Teig;

public interface PizzaZutatenFabrik {

   public Teig erstelleTeig();

   public Sosse erstelleSosse();

   public Krabben erstelleKrabben();

}
