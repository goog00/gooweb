package com.gooweb.datastruct.algorithms;


/**
 * 原地归并
 * @author steng
 * @description merge sort
 * @date 2019-12-11 9:50 上午
 **/
public class Mergesort {

    private static Comparable[] aux = new Comparable[]{}  ;


    //原地归并排序
    public static void merge (Comparable[] a ,int lo,int mid,int hi){
        //Merge a[lo ... mid] with a[mid+1...hi]
        int i = lo,j = mid + 1;

        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }

        //归并回到a[lo,,,,hi]
        for(int k = lo; k <= hi; k++){
            if(i > mid){
                //左半边用尽（取右半边元素）
                a[k] = aux[j++];
            } else if(j > hi){
                //右半边用尽（取左半边元素）
                a[k] = aux[i++];
            } else if(less(aux[j],aux[i])){
                //右半边的当前元素小于左半边的当前元素（取右半边的元素）
                a[k] = aux[j++];
            } else {
                //右半边的当前元素大于等于左半边的当前元素（取左半边的元素）
                a[k] = aux[i++];
            }
        }
    }





    private static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0;
    }
}
