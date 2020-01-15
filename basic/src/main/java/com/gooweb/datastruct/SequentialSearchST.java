package com.gooweb.datastruct;

/**
 * @author steng
 * @description 顺序查找-基于无序链表
 * @date 2019-12-09 7:57 上午
 **/
public class SequentialSearchST<Key,Value> {

    private Node first;

    private class Node {
        //链表结点的定义
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key){
        //查找给定的健，返回相关联的值
        for (Node x = first; x != null; x = x.next){
            if(key.equals(x.key)){
                //命中
                return x.val;
            }
        }
        return null;
    }

    public void put(Key key,Value val){
        //查找给定的健，找到则更新其新值，否则在表中新建结点
        for(Node x = first;  x != null; x = x.next){
            if(key.equals(x.key)){
                //命中，更新
                x.val = val;
                return;
            }
        }
        //未命中，新健结点
        first = new Node(key,val,first);
    }
}
