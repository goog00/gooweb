package com.gooweb.thread.stamplock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author steng
 * @description
 * @date 2020-02-29 1:19 下午
 **/
public class StampedLockDemo {

    public static void main(String[] args) {
        final StampedLock stampedLock = new StampedLock();

        //获取/释放悲观读锁
        long stamp = stampedLock.readLock();
        try{

        } finally {
            stampedLock.unlockRead(stamp);
        }

        long writeLock = stampedLock.writeLock();
        try {

        }finally {
            stampedLock.unlockWrite(writeLock);
        }

    }
}
