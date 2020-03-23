package com.gooweb.thread.readwriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *  写锁降级
 * @author steng
 * @description
 * @date 2020-02-29 1:56 下午
 **/
public class CacheData {

    Object data;
    volatile boolean cacheValid;

    final ReadWriteLock rwl = new ReentrantReadWriteLock();

    //读锁
    final Lock r = rwl.readLock();

    //写锁
    final Lock w = rwl.writeLock();

    void processCacheData(){
        //获取读锁
        r.lock();

        if(!cacheValid){
            //释放读锁.因为不允许读锁升级
            r.unlock();
            //获取写锁
            w.lock();
            try{
                //再次检查状态
                if(!cacheValid){
                    data = null;
                    cacheValid = true;
                }
                //释放写锁前,降级为读锁
                //允许降级
                r.lock();
            } finally {
                w.unlock();
            }
        }
        //此处仍然持有读锁
        try{
            use(data);
        } finally {
            r.unlock();
        }
    }

    void use(Object data){

    }

}
