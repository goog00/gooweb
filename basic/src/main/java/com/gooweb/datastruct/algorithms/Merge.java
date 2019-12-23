package com.gooweb.datastruct.algorithms;

import static com.gooweb.datastruct.algorithms.Mergesort.merge;

/**
 * @author steng
 * @description 自顶向下的归并排序
 * @date 2019-12-23 7:34 上午
 **/
public class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length - 1);
    }

    private static void sort(Comparable[] a,int lo, int hi){
        //将数组a[lo.....hi] 排序
        if(hi <= lo){
            return;
        }
        int mid = lo + (hi - lo) / 2;
        //将左半边排序
        sort(a,lo,mid);
        //将右半边排序
        sort(a,mid+1,hi);
        //归并结果
        merge(a,lo,mid,hi);
    }
}
