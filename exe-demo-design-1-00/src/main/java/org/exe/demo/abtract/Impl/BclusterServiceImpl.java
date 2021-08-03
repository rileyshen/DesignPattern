package org.exe.demo.abtract.Impl;

import org.exe.demo.abtract.CacheService;
import org.exe.demo.abtract.matter.Acluster;
import org.exe.demo.abtract.matter.Bcluster;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
public class BclusterServiceImpl implements CacheService {

    private Bcluster bcluster = new Bcluster();

    @Override
    public String get(String key) {
        return  bcluster.get(key);
    }

    @Override
    public void set(String key, String value) {
        bcluster.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        bcluster.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        bcluster.del(key);
    }
}
