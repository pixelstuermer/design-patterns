package com.github.pixelstuermer.patterns.abstrakt.factory.util;

import com.github.pixelstuermer.patterns.abstrakt.factory.model.Krabben;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.MuenchnerSosse;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Sosse;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.SupermarktKrabben;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.Teig;
import com.github.pixelstuermer.patterns.abstrakt.factory.model.TeigMitDickerKruste;

public class MuenchnerPizzaZutatenFabrik implements PizzaZutatenFabrik {

   @Override
   public Teig erstelleTeig() {
      return new TeigMitDickerKruste();
   }

   @Override
   public Sosse erstelleSosse() {
      return new MuenchnerSosse();
   }

   @Override
   public Krabben erstelleKrabben() {
      return new SupermarktKrabben();
   }

}
