package com.googoo.lock;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/**
 * 分布式锁接口
 *
 * @author sunteng
 * @create 2019-10-10 下午 5:30
 **/
public interface DistributedLock {

    RLock lock(String key);

    RLock lock(String lockKey, int timeout);

    RLock lock(String lockKey, TimeUnit uni, int timeout);

    boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime);

    void unlock(String lockKey);

    void unlock(RLock rLock);
}
