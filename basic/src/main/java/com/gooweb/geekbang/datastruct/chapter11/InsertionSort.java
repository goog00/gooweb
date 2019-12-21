package com.gooweb.geekbang.datastruct.chapter11;

/**
 * @author steng
 * @description 插入排序
 * @date 2019-12-21 2:38 下午
 **/
public class InsertionSort {

    /**
     * 时间复杂度：
     * 最好：O(n)
     * 最坏：O(n^2)
     * 平均：O(n^2)
     */

    public static void insertionSort(int[] a, int n){
        if(n <= 1){
            return;
        }
        for(int i = 1; i < n; ++i){
            //数组分为两个部分，左边为已排序部分，右边为未排序部分
            //a[i]等于为排序的第一个值
            int value = a[i];
            int j = i-1;
            //和已排序的数组元素比较，然后插入已排序的数组中
            //j等于已排序数组的最大索引值
            for(; j >=0; --j){
                if(a[j] > value){
                    //第一次a[j] > value,a[j+1]指向value对应的索引i，因为a[j] > value ,所以把a[j]向右移动一位覆盖value的位置
                    //然后--j,使value 依次和已经排好序的数组比较，直达遇到比value更小的跳出；
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = value;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{3,5,6,9,4,1};
        insertionSort(a,a.length);

        for(int i = 0;i < a.length; i++){
            System.out.println(a[i]);
        }
    }

}
