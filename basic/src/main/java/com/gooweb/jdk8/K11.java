package com.gooweb.jdk8;

import java.util.Scanner;

/**
 * @author steng
 * @description
 * @date 2020-11-04 09:54
 **/
public class K11 {
    /**
     * 编写数组处理程序a3.java。
     * 要求定义整型数组，并从键盘上输入10个数据，
     * 然后求出其中的最大者和所有数据的总和。
     */

    static int[] arr = new int[10];
    static  int i = 0;
    static int max = arr[0];
    static int sum = 0;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        for(; i< 10;i++){
            if(scanner.hasNext()){
                String str = scanner.next();
                arr[i] = Integer.parseInt(str);
                if(arr[i] > max){
                    max = arr[i];
                }
                sum += arr[i];

            }
        }


        System.out.println(max);
        System.out.println(sum);

        scanner.close();

    }
}
