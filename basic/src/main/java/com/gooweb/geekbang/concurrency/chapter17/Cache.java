package com.gooweb.geekbang.concurrency.chapter17;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 使用读写锁实现缓存
 * @author sunteng
 * @create 2019-07-26 上午 8:59
 **/
public class Cache<K,V> {
    final Map<K,V> m = new HashMap<>();

    final ReadWriteLock rwl = new ReentrantReadWriteLock();

    //读锁
    final Lock r = rwl.readLock();

    //写锁
    final Lock w = rwl.writeLock();

    //读缓存
    V get(K key){
        r.lock();
        try{
            return m.get(key);
        } finally {
            r.unlock();
        }
    }

    //写缓存

    V put(K key, V v){
        w.lock();
        try{
            return m.put(key,v);
        } finally {
            w.unlock();
        }
    }
}
