package com.gooweb.leetcode.medium;

import java.util.Hashtable;

/**
 * 146 LRU
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 * 进阶:
 *
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lru-cache
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sunteng
 * @create 2019-08-26 下午 4:05
 **/
public class LRUCache {

    private Hashtable<Integer,DLinkedNode> cache = new Hashtable<Integer,DLinkedNode>();
    private int count;
    private int capacity;
    private DLinkedNode head,tail;

    public LRUCache(int capacity){
        //缓存空间使用量
        this.count = 0;
        //缓存容量阈值
        this.capacity = capacity;

        //缓存容器初始化时，设置头节点
        head = new DLinkedNode();
        head.pre = null;

        //缓存容器初始化时，设置尾节点
        tail = new DLinkedNode();
        tail.post = null;

        //双向链表
        head.post = tail;
        tail.pre = head;
    }




    /**
     * 增加节点
     * @param node
     */
    private void addNode(DLinkedNode node){
        //新节点pre 指向头节点
        node.pre = head;
        //新节点的post 指向head 的下一个节点
        node.post = head.post;

        // head的post节点的pre指向node
        head.post.pre = node;
        //head的post节点指向新节点
        head.post = node;

    }


    /**
     * remove an existing node from the linked list
     * @param node
     */
    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;

        pre.post = post;
        post.pre = pre;
    }

    /**
     * Move certain node in between to the head
     * @param node
     */
    private void moveToHead(DLinkedNode node){

        this.removeNode(node);
        this.addNode(node);
    }

    /**
     * pop the current tail
     * @return
     */
    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }


    /**
     * //根据lru 思想,把最近使用的元素移动头节点后面的位置
     * @param key
     * @return
     */
    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }

        //move the accessed node to head
        this.moveToHead(node);

        return node.value;

    }


    /**
     *
     * @param key
     * @param value
     */
    public void put(int key,int value){
        DLinkedNode node = cache.get(key);

        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key,newNode);
            this.addNode(newNode);

            ++count;

            //当缓存使用量大于缓存阈值时
            if(count > capacity){
                //pop the tail
                DLinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                --count;
            }
        } else {
            // update the value
            node.value = value;
            this.moveToHead(node);
        }
    }


    class DLinkedNode{
        int key;
        int value;
        //前一个节点
        DLinkedNode pre;
        //后一个节点
        DLinkedNode post;
    }



}
