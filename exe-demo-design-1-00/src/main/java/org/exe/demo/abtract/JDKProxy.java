package org.exe.demo.abtract;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, CacheService cacheService) throws Exception {

        InvocationHandler handler = new JDKInvocationHandler(cacheService);

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Class<?>[] classes = interfaceClass.getInterfaces();

        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
