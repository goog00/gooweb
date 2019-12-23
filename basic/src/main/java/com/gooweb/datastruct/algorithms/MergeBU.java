package com.gooweb.datastruct.algorithms;

import static com.gooweb.datastruct.algorithms.Mergesort.merge;

/**
 *
 * @author steng
 * @description 子底向上的归并排序
 * @date 2019-12-23 7:36 上午
 **/
public class MergeBU {

    //归并所需的辅助数组
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        //进行lgN次两两归并
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1; sz < N; sz = sz + sz){
            for(int lo = 0; lo < N - sz; lo += sz + sz){//sz 子数组大小
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));//lo:子数组索引
            }
        }
    }
}
