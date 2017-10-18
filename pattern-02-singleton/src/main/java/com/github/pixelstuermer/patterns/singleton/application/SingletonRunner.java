package com.github.pixelstuermer.patterns.singleton.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pixelstuermer.patterns.singleton.models.SingletonFour;
import com.github.pixelstuermer.patterns.singleton.models.SingletonOne;
import com.github.pixelstuermer.patterns.singleton.models.SingletonThree;
import com.github.pixelstuermer.patterns.singleton.models.SingletonTwo;

public class SingletonRunner {

   private static final Logger LOGGER = LoggerFactory.getLogger( SingletonRunner.class );

   public static void main( String[] args ) {
      SingletonOne singletonOneA = SingletonOne.getInstance();
      singletonOneA.number = 5;
      singletonOneA.text = "Foo";
      singletonOneA.hidden = true;

      SingletonOne singletonOneB = SingletonOne.getInstance();
      singletonOneB.text = "Bar";

      SingletonOne.getInstance().hidden = false;

      LOGGER.info( "1) Run with {}, {} and {}",
         singletonOneA.number, singletonOneA.text, singletonOneA.hidden );

      SingletonTwo singletonTwoA = SingletonTwo.getInstance();
      singletonTwoA.number = 10;
      singletonTwoA.text = "Alice";
      singletonTwoA.hidden = true;

      SingletonTwo singletonTwoB = SingletonTwo.getInstance();
      singletonTwoB.text = "Bob";

      SingletonTwo.getInstance().number = 999;

      LOGGER.info( "2) Run with {}, {} and {}",
         singletonTwoA.number, singletonTwoA.text, singletonTwoA.hidden );

      SingletonThree singletonThreeA = SingletonThree.getInstance();
      singletonThreeA.number = 12345;
      singletonThreeA.text = "Mister";
      singletonThreeA.hidden = false;

      SingletonThree singletonThreeB = SingletonThree.getInstance();
      singletonThreeB.hidden = true;

      SingletonThree.getInstance().text = "Lady";

      LOGGER.info( "3) Run with {}, {} and {}",
         singletonThreeA.number, singletonThreeA.text, singletonThreeA.hidden );

      SingletonFour singletonFourA = SingletonFour.getInstance();
      singletonFourA.number = 42;
      singletonFourA.text = "abc";
      singletonFourA.hidden = false;

      SingletonFour singletonFourB = SingletonFour.getInstance();
      singletonFourB.number = 3008;
      singletonFourB.text = "xyz";

      SingletonFour.getInstance().number = 1202;

      LOGGER.info( "4) Run with {}, {} and {}",
         singletonFourA.number, singletonFourA.text, singletonFourA.hidden );
   }

}
