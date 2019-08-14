package com.gooweb.leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    
    private Queue<Integer> q1 = new LinkedList();
    private Queue<Integer> q2 = new LinkedList();
    
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size() > 1){
            //由于队列性质是先进先出，需要翻转队列的元素顺序，然后出第一个元素，所以 从 q1中取出元素，入队到q2中。
            top = q1.remove();
            q2.add(top);
        }
        //因为栈是后进先出，而队列是先进先出，so，出栈则需要出队列q1的队尾元素，上面的while处理了q1对列的前q1.size -1 个元素，剩余了队尾元素.
        int tail  = q1.remove();
        //把翻转后q2引用指向q1,
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return tail;
        
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }


    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(5);
        obj.push(7);

        int pop1 = obj.pop();
        System.out.println("pop1 = " + pop1);
        int pop2 = obj.pop();
        System.out.println("pop2 = " + pop2);

        int pop3 = obj.pop();
        System.out.println("pop3 = " + pop3);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

