//package com.gooweb.thread.leetcode;
//
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.CyclicBarrier;
//import java.util.concurrent.Semaphore;
//import java.util.function.IntConsumer;
//
///** leetcode 题目
// *  1116. 打印零与奇偶数
// * https://leetcode-cn.com/problems/print-zero-even-odd/
// * @author sunteng
// * @create 2019-08-11 下午 3:19
// **/
//public class ZeroEvenOdd2 {
//
//    private int n;
//
//    private CyclicBarrier c;
//
//    private CyclicBarrier c1;
//
//    private CyclicBarrier c2;
//
//
//    public ZeroEvenOdd2(int n){
//        this.n = n;
//        c = new CyclicBarrier(1);
//        c1 = new CyclicBarrier(0);
//        c2 = new CyclicBarrier(0);
//    }
//
//
//    /**
//     * 打印0
//     * @param n
//     */
//    public void zero(IntConsumer printNumber) throws InterruptedException {
//        for(int i = 1; i <= n; i++){
//            //
//
//        }
//    }
//
//    /**
//     * 打印偶数
//     * @param n
//     */
//    public void even(IntConsumer printNumber) throws InterruptedException {
//        for(int i = 2; i <= n; i+=2){
//        }
//    }
//
//
//    /**
//     * 打印奇数
//     * @param n
//     */
//    public void odd(IntConsumer printNumber) throws InterruptedException {
//        for(int i = 1; i<=n; i+=1){
//        }
//    }
//}
