package com.gooweb.datastruct;

import java.util.Objects;
import java.util.Queue;

/**
 * @author steng
 * @description 二分查找（基于有序数组）
 * @date 2019-12-09 8:17 上午
 **/
public class BinarySearchST<Key extends Comparable<Key>,Value> {

    private Key[] keys;
    private Value[] vals;
    private int N;
    public BinarySearchST(int capacity){
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Objects[capacity];
    }

    public int size(){
        return N;
    }

    public Value get(Key key){
        if(isEmpty()) {
            return null;
        }
        int i = rank(key);
        if(i < N && keys[i].compareTo(key) == 0){
            return vals[i];
        }
        else{
            return null;
        }

    }

    public boolean isEmpty(){
        return size() == 0;
    }

    /**
     *  二分查找
     * @param key
     * @return
     */
    public int rank(Key key){
        //低位索引
        int lo = 0;
        //高位索引
        int hi = N -1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if(cmp < 0){
                hi = mid -1;
            } else if(cmp > 0){
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
    public void put(Key key,Value val){
        int i = rank(key);
        if(i < N &&  keys[i].compareTo(key) == 0){
            vals[i] = val;
            return;
        }
        for(int j = N ; j >i; j--){
            keys[j] = keys[j - 1];
            vals[j] = vals[j-1];
        }
        keys[i] = key;
        vals[i] = val;
        N++;
    }

    public Key min(){
        return keys[0];
    }

    public Key max(){
        return keys[N-1];
    }

    public Key select(int k){
        return keys[k];
    }

    public Key ceiling(Key key){
        int i = rank(key);
        return keys[i];
    }

    public Iterable<Key> keys(Key lo,Key hi){
//        Queue<Key> q = new Queue<Key>() ;
        return null;
    }





}
