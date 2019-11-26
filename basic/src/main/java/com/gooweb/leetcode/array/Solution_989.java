package com.gooweb.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunteng
 * @create 2019-08-17 下午 7:20
 **/
public class Solution_989 {

    public static List<Integer> addToArrayForm(int[] A, int K) {

        String k = "";
        for(int i = 0; i < A.length ;i++){
            k= k + A[i];
        }
        Integer inte = Integer.parseInt(k);
        Integer kk = inte + K;
        System.out.println(kk);

        List<Integer> list = new ArrayList<>();
        String s = kk.toString();
        byte[] bytes = s.getBytes();
        for(byte b : bytes){
            int i = Byte.toUnsignedInt(b);
            list.add(i);
        }
        list.add(kk);
        return list;

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,0,0};
        List<Integer> list = addToArrayForm(a, 12);
        for(Integer integer : list){
            System.out.println(integer);
        }
    }

}
