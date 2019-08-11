package com.gooweb.thread.leetcode;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/** leetcode 题目
 *  1116. 打印零与奇偶数
 * https://leetcode-cn.com/problems/print-zero-even-odd/
 * @author sunteng
 * @create 2019-08-11 下午 3:19
 **/
public class ZeroEvenOdd {

    private int n;

    private Semaphore s,s1,s2;

    public ZeroEvenOdd(int n){
        this.n = n;
        s = new Semaphore(1);
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
    }


    /**
     * 打印0
     * @param n
     */
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i = 1; i <= n; i++){
            //
            s.acquire();
            printNumber.accept(0);
            if((i&1) == 0){
                //偶数
                s1.release();
            } else {
                //奇数
                s2.release();
            }

        }
    }

    /**
     * 打印偶数
     * @param n
     */
    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i = 2; i <= n; i+=2){
            s1.acquire();
            printNumber.accept(i);
            s.release();
        }
    }


    /**
     * 打印奇数
     * @param n
     */
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i = 1; i<=n; i+=1){
            s2.acquire();
            printNumber.accept(i);
            s.release();
        }
    }
}
