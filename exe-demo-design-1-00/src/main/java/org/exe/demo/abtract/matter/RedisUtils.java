package org.exe.demo.abtract.matter;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-03
 */
@Slf4j
public class RedisUtils {

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        log.info("Redis get data key: {}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("Redis write data key: {}, val: {}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("Redis write data key: {}, val: {} timeout: {}, timeunit: {}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("Redis delete data key: {}", key);
         dataMap.remove(key);
    }
}
