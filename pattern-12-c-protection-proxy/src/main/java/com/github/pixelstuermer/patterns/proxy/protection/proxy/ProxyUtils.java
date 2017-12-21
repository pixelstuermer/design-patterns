package com.github.pixelstuermer.patterns.proxy.protection.proxy;

import java.lang.reflect.Proxy;

import com.github.pixelstuermer.patterns.proxy.protection.invocationHandler.NotOwnerInvocationHandler;
import com.github.pixelstuermer.patterns.proxy.protection.invocationHandler.OwnerInvocationHandler;
import com.github.pixelstuermer.patterns.proxy.protection.model.PersonBean;

public final class ProxyUtils {

   public static PersonBean getOwnerProxy( PersonBean personBean ) {
      PersonBean personBeanProxy = (PersonBean) Proxy.newProxyInstance(
         personBean.getClass().getClassLoader(),
         personBean.getClass().getInterfaces(),
         new OwnerInvocationHandler( personBean ) );
      return personBeanProxy;
   }

   public static PersonBean getNotOwnerProxy( PersonBean personBean ) {
      PersonBean personBeanProxy = (PersonBean) Proxy.newProxyInstance(
         personBean.getClass().getClassLoader(),
         personBean.getClass().getInterfaces(),
         new NotOwnerInvocationHandler( personBean ) );
      return personBeanProxy;
   }

}
