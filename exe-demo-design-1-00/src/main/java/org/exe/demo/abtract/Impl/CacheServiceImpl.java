package org.exe.demo.abtract.Impl;

import org.exe.demo.abtract.CacheService;
import org.exe.demo.abtract.matter.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-05
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
