package com.gooweb.geekbang.concurrency.chapter15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 阻塞队列
 *
 * @author sunteng
 * @create 2019-07-26 上午 8:32
 **/
public class BlockedQueue<T> {

    final Lock lock = new ReentrantLock();

    //条件变量：队列不满
    final Condition notFull = lock.newCondition();

    //条件变量：队列为空
    final Condition notEmpty = lock.newCondition();


//    //入队
//    void enq(T x){
//        lock.lock();
//        try{
//            while (队列已满){
//                //等待队列不满
//                notFull.await();
//            }
//
//            // 入队后，通知可出队
//            notEmpty.signal();
//        } finally {
//            lock.unlock();
//        }
//
//    }
//
//    //出队
//    void deq(){
//        lock.lock();
//
//        try{
//            while ("队列已空"){
//                //等待队列不空
//                notEmpty.await();
//            }
//
//            notFull.signal();
//        } finally {
//            lock.unlock();
//        }
//
//    }

}
