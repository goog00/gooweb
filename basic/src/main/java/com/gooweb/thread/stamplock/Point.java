package com.gooweb.thread.stamplock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author steng
 * @description
 * @date 2020-02-29 1:26 下午
 **/
public class Point {

    private int x,y;
    final StampedLock sl = new StampedLock();

    //计算到原点的距离
    int distanceFromOrigin(){
        //乐观读
        long stamp = sl.tryOptimisticRead();

        //读入局部变量,读过程数据可能被修改
        int cux = x,cuy = y;
        //判断执行读期间,是否存在写操作,如果存在,则sl.validate返回false

        if (!sl.validate(stamp)) {

            //升级为读悲观锁
            stamp = sl.readLock();

            try {
                cux = x;
                cuy = y;
            } finally {
                sl.unlockRead(stamp);
            }
        }

        return (int) Math.sqrt(cux * cux + cuy *cuy);
    }
}
