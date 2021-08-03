package org.exe.demo.abtract.Impl;

import org.exe.demo.abtract.CacheService;
import org.exe.demo.abtract.matter.Acluster;
import org.exe.demo.abtract.matter.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class AclusterServiceImpl implements CacheService {

    private Acluster acluster = new Acluster();

    @Override
    public String get(String key) {
        return  acluster.gain(key);
    }

    @Override
    public void set(String key, String value) {
        acluster.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        acluster.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        acluster.delete(key);
    }
}
