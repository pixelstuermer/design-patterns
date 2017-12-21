package com.github.pixelstuermer.patterns.proxy.protection.model;

public class PersonBeamImplementation implements PersonBean {

   private String name;
   private String gender;
   private int overallRating;
   private int ratingCounter;

   public PersonBeamImplementation( String name, String gender ) {
      this.name = name;
      this.gender = gender;
      this.overallRating = 0;
      this.ratingCounter = 0;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public String getGender() {
      return gender;
   }

   @Override
   public int getOverallRating() {
      if ( ratingCounter == 0 ) {
         return 0;
      }
      else {
         return (overallRating / ratingCounter);
      }
   }

   @Override
   public void setName( String name ) {
      this.name = name;
   }

   @Override
   public void setGender( String gender ) {
      this.gender = gender;
   }

   @Override
   public void addNewRating( int newRating ) {
      overallRating += newRating;
      ratingCounter++;
   }

}
