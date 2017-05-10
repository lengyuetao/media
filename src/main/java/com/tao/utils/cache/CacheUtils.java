package com.tao.utils.cache;

import org.springframework.cache.Cache;

import java.util.concurrent.Callable;

/**
 * Created by zhangantao on 2017/5/4.
 */
public class CacheUtils implements Cache{

    public String getName() {
        return null;
    }

    public Object getNativeCache() {
        return null;
    }

    public ValueWrapper get(Object key) {
        return null;
    }

    public <T> T get(Object key, Class<T> type) {
        return null;
    }

    public <T> T get(Object key, Callable<T> valueLoader) {
        return null;
    }

    public void put(Object key, Object value) {

    }

    public ValueWrapper putIfAbsent(Object key, Object value) {
        return null;
    }

    public void evict(Object key) {

    }

    public void clear() {

    }
}
