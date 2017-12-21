package com.github.pixelstuermer.patterns.proxy.protection.application;

import com.github.pixelstuermer.patterns.proxy.protection.model.PersonBeamImplementation;
import com.github.pixelstuermer.patterns.proxy.protection.model.PersonBean;
import com.github.pixelstuermer.patterns.proxy.protection.proxy.ProxyUtils;

public class RatingApplication {

   public static void main( String[] args ) {
      PersonBean joe = new PersonBeamImplementation( "Joe", "male" );
      PersonBean ownerProxy = ProxyUtils.getOwnerProxy( joe );

      System.out.println();
      System.out.println( "Name:\t" + ownerProxy.getName() );
      System.out.println( "Gender:\t" + ownerProxy.getGender() );
      System.out.println( "Rating:\t" + ownerProxy.getOverallRating() );
      System.out.println( "\n--------------------\n" );

      ownerProxy.setName( "Jolene" );
      ownerProxy.setGender( "female" );
      ownerProxy.addNewRating( 10 );

      System.out.println();
      System.out.println( "Name:\t" + ownerProxy.getName() );
      System.out.println( "Gender:\t" + ownerProxy.getGender() );
      System.out.println( "Rating:\t" + ownerProxy.getOverallRating() );
      System.out.println( "\n--------------------\n" );

      PersonBean notOwnerProxy = ProxyUtils.getNotOwnerProxy( joe );

      System.out.println();
      System.out.println( "Name:\t" + notOwnerProxy.getName() );
      System.out.println( "Gender:\t" + notOwnerProxy.getGender() );
      System.out.println( "Rating:\t" + notOwnerProxy.getOverallRating() );
      System.out.println( "\n--------------------\n" );

      notOwnerProxy.setName( "Joe" );
      notOwnerProxy.setGender( "male" );
      notOwnerProxy.addNewRating( 10 );

      System.out.println();
      System.out.println( "Name:\t" + notOwnerProxy.getName() );
      System.out.println( "Gender:\t" + notOwnerProxy.getGender() );
      System.out.println( "Rating:\t" + notOwnerProxy.getOverallRating() );
   }

}
