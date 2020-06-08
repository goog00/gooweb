package com.gooweb.thread.stamplock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author steng
 * @description
 * @date 2020-03-31 9:43 上午
 **/
public class StampedSample {
    private final StampedLock sl = new StampedLock();

    void mutate(){
        long stamp = sl.writeLock();
        try {
            write();
        } finally {
            sl.unlockWrite(stamp);
        }

    }

    Object access(){
        long stamp = sl.tryOptimisticRead();
        Object data = read();
        if(!sl.validate(stamp)){
            stamp = sl.readLock();
            try{
                read();
            } finally {
                sl.unlockRead(stamp);
            }
        }
        return data;
    }

    void write(){

    }

    Object read(){
        return new Object();
    }
}
