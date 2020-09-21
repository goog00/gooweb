package com.gooweb.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author steng
 * @description
 * @date 2020-08-13 10:01 下午
 **/
public class MyArrayBlockQueue {


    private static Integer size = 20;
    private List arrayList;
    private Lock lock;
    private Condition notEmpty ;
    private Condition notFull;

    public MyArrayBlockQueue(){
        arrayList = new ArrayList(size);
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }


    public void offer(Object object){
        lock.lock();
        if(arrayList.size() == size){
            try {
                notEmpty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        arrayList.add(object);
        notFull.signal();

    }

    public Object take(){
        lock.lock();
        if(arrayList.size() == 0){
            try {
                notFull.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Object object =  arrayList.remove(arrayList.size()-1);
        notEmpty.signal();
        return object;

    }
}
