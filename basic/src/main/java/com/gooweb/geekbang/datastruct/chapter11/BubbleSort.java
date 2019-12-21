package com.gooweb.geekbang.datastruct.chapter11;

/**
 * @author steng
 * @description 冒泡算法排序
 * @date 2019-12-21 2:02 下午
 **/
public class BubbleSort {


    /**
     * 稳定
     * 时间复杂度：
     * 最好：O(n)
     * 最坏：O(n^2)
     * 平均：O(n^2)
     */
    public static void bubbleSort(int[] a,int n){

        if(n <= 1){
            return;
        }

        for(int i = 0; i < n; i++){
            //提前退出冒泡循环的标志位
            boolean flag = false;
            for(int j = 0; j < n -1 -i; ++j ){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }

            }
            if(!flag){
                break;//表示没有数据交换，提前退出
            }

        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{3,5,6,9,4,1,6};
        bubbleSort(a,a.length);

        for(int i = 0;i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
