package org.exe.demo.abtract;

import java.util.concurrent.TimeUnit;
// act like factory
public interface CacheService {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
