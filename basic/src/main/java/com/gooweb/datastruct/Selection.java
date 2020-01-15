package com.gooweb.datastruct;

/**
 * @author steng
 * @description select sort
 * @date 2019-12-10 5:00 下午
 **/
public class Selection extends AbstractSort{

    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int N = a.length;
        for(int i = 0; i < N; i ++){

            int min = i;
            for(int j = i + 1; j< N; j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }

            exch(a,i,min);

        }
    }



}
