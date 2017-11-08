package com.github.pixelstuermer.patterns.abstrakt.factory.util;

import com.github.pixelstuermer.patterns.abstrakt.factory.model.BerlinerSosse;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.FrischeKrabben;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Krabben;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Sosse;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Teig;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.TeigMitDuennerKruste;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {

   @Override
   public Teig erstelleTeig() {
      return new TeigMitDuennerKruste();
   }

   @Override
   public Sosse erstelleSosse() {
      return new BerlinerSosse();
   }

   @Override
   public Krabben erstelleKrabben() {
      return new FrischeKrabben();
   }

}
