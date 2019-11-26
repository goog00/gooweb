package com.googoo.lock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 使用Redisson实现分布式锁
 *
 * @author sunteng
 * @create 2019-10-10 下午 5:35
 **/
@Component
public class RedissonDistributedLock implements DistributedLock {

    @Autowired
    private RedissonClient redissonClient;

    /**
     * 超时时间默认30s
     * @param lockKey
     * @return
     */
    @Override
    public RLock lock(String lockKey) {

        RLock lock = redissonClient.getLock(lockKey);
        lock.lock();

        return lock;
    }

    /**
     * 设置锁定时间
     * @param lockKey
     * @param timeout 单位秒,
     * @return
     */
    @Override
    public RLock lock(String lockKey, int timeout) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(timeout,TimeUnit.SECONDS);
        return lock;
    }

    /**
     * 设置锁定时间和单位
     * @param lockKey
     * @param unit
     * @param timeout
     * @return
     */
    @Override
    public RLock lock(String lockKey, TimeUnit unit, int timeout) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(timeout,unit);
        return lock;
    }

    /**
     *
     * @param lockKey 锁key
     * @param unit
     * @param waitTime
     * @param leaseTime
     * @return
     */
    @Override
    public boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime) {

        RLock lock = redissonClient.getLock(lockKey);

        try {
            lock.tryLock(waitTime,leaseTime,unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void unlock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.unlock();
    }

    @Override
    public void unlock(RLock rLock) {
        rLock.unlock();
    }
}
