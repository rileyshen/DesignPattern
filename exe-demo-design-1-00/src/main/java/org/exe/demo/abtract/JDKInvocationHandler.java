package org.exe.demo.abtract;


import sun.misc.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class JDKInvocationHandler implements InvocationHandler {

    private CacheService cacheService;

    public JDKInvocationHandler(CacheService cacheService) {
        this. cacheService =  cacheService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return CacheService.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheService, args);
    }
}
