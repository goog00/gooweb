package com.gooweb.leetcode.queue;

/**
 * 循环队列实现
 *
 * @author sunteng
 * @create 2019-08-13 上午 8:41
 **/
public class MyCircularQueue {

    private int[] data;

    private int head;

    private int tail;

    private int size;


    public MyCircularQueue(int k){
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /**
     * insert an element  into the circular queue ,return true if the operation is successful
     * @param value
     * @return
     */
    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /**
     * delete an element from the circular queue; return true if the operation is sucessful
     * @return
     */
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /**
     * get the front item from the queue
     * @return
     */
    public int front(){
      if(isEmpty()){
          return -1;
      }
      return data[head];
    }

    /**
     * get the last item from the queue
     * @return
     */
    public int rear(){
      if(isEmpty()){
          return -1;
      }
      return data[tail];
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        return ((tail + 1) % size ) == head;
    }

}
