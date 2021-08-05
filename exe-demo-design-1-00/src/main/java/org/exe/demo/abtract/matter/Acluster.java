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
public class Acluster {


        private Map<String, String> dataMap = new ConcurrentHashMap<>();

        public String gain(String key) {
            log.info("Acluster get data key: {}", key);
            return dataMap.get(key);
        }

        public void set(String key, String value) {
            log.info("Acluster write data key: {}, val: {}", key, value);
            dataMap.put(key, value);
        }

        public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
            log.info("Acluster write data key: {}, val: {} timeout: {}, timeunit: {}", key, value, timeout, timeUnit);
            dataMap.put(key, value);
        }

        public void delete(String key) {
            log.info("Acluster delete data key: {}", key);
            dataMap.remove(key);
        }


}