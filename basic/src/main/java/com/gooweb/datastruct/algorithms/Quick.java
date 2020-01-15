package com.gooweb.datastruct.algorithms;

import com.gooweb.datastruct.AbstractSort;

/**
 * @author steng
 * @description 快速排序
 * @date 2020-01-08 7:57 上午
 **/
public class Quick extends AbstractSort {

    public static void sort(Comparable[] a){
        sort(a,0,a.length -1);
    }

    private static void sort(Comparable[] a,int lo,int hi){
        if(hi <= lo){
            return;
        }
        //切分
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        //将数组切分为a[lo.....i-1],a[i],a[i+1...hi]
        int i = lo,j = hi +1;
        Comparable v = a[lo];
        while (true){
            //扫描左右,检查扫描是否结束并交换元素
            while (less(a[++i], v)) {
                if(i == hi){
                    break;
                }
            }
            while (less(v,a[--j])){
                if(j == lo){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            exch(a,i,j);
        }

        //将v = a[j] 放入正确的位置
        exch(a,lo,j);
        //a[lo....j-1] <= a[j] <= a[j+1....hi]
        return j;
    }

    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{'K','R','A','T','E','L','E','P','U','I','M','Q','C','X','O','S'};
        sort(a);
        for(int i = 0 ; i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
