package com.gooweb.datastruct;

/**
 * @author steng
 * @description
 * @date 2020-01-08 8:02 上午
 **/
public class AbstractSort {

     protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i ,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
