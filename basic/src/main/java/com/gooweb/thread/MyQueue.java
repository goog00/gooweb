package com.gooweb.thread;

import java.util.LinkedList;

/**
 * @author steng
 * @description
 * @date 2020-08-12 2:56 下午
 **/
public class MyQueue  {

    private final static Integer MAX_SIZE = 100;

    private LinkedList<String> queue = new LinkedList<>();

    public synchronized void offer(String element){

        try {
            if(queue.size() == MAX_SIZE){
                wait();//释放锁,当前线程阻塞
            }
            queue.addLast(element);
            notifyAll();//唤醒持有该锁的线程
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public synchronized String take(){
        String element = null;

        try {
            if(queue.size() == 0){
                wait();//释放锁,当前线程阻塞;
            }
            element = queue.removeFirst();
            notifyAll();//唤醒持有该锁的线程;
        } catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));

    }

    static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            //count += n & 1;
            int m = n & 1;
            System.out.println(n);
            count = count + m;

            n = n >>> 1;
            System.out.println(n);
        }
        return count;
    }

}
