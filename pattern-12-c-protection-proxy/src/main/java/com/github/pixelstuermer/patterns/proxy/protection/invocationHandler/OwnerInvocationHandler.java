package com.github.pixelstuermer.patterns.proxy.protection.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.github.pixelstuermer.patterns.proxy.protection.model.PersonBean;

public class OwnerInvocationHandler implements InvocationHandler {

   private PersonBean personBean;

   public OwnerInvocationHandler( PersonBean personBean ) {
      this.personBean = personBean;
   }

   @Override
   public Object invoke( Object proxy, Method method, Object[] args ) throws IllegalAccessException {
      try {
         if ( method.getName().startsWith( "get" ) ) {
            return method.invoke( personBean, args );
         }
         else if ( method.getName().equalsIgnoreCase( "addNewRating" ) ) {
            throw new IllegalAccessException();
         }
         else if ( method.getName().startsWith( "set" ) ) {
            return method.invoke( personBean, args );
         }
      }
      catch ( Exception e ) {
         e.printStackTrace();
      }
      return null;
   }

}
